package practice.treesearch;

import java.util.*;

public class RightSideView {

    public static ArrayList<Integer> dfsRightSide(Node root){
        ArrayList<Integer> rightMost = new ArrayList<>();
        dfsRightSide(root, 0, rightMost);
        return rightMost;
    }

    public static void dfsRightSide(Node root, int depth, ArrayList<Integer> rightMost){
        if(root == null){
            return ;
        }
        if(depth == rightMost.size()){
            rightMost.add(root.val);
        }
        dfsRightSide(root.right, depth+1, rightMost);
        dfsRightSide(root.left, depth+1, rightMost);
    }


    public static ArrayList<Integer> bfsRightSide(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            Integer rightMost = null;

            for(int i=0; i< levelSize; i++){
                Node node =  queue.poll();
                rightMost = node.val;

                if(node.left != null){
                    queue.add(node.left);
                }if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(rightMost);
        }
        return result;
    }

    public static ArrayList<Integer> bfs(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            Integer rightmost = null;
            for(int i=0; i< levelSize; i++ ){
                Node node = queue.poll();
                rightmost = node.val;

                if(node.left != null) queue.add((node.left));
                if(node.right != null) queue.add(node.right);
            }
            result.add(rightmost);
        }
        return result;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        ArrayList<Integer> result = bfs(root);
        System.out.print(result);
    }
}
