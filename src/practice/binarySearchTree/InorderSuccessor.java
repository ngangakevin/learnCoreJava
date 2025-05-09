package practice.binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessor {
    public static Node inorderSuccessor(Node root, Node p){
        Node successor = null;

        while(root != null){
            if (p.item < root.item){
                successor = root;
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return successor;
    }

    public static Node inorderSuccessorRightSubtree(Node root, Node p){
        List<Integer> test = new ArrayList<>();
        test.add(1);
        Node  node = p.right;
        if( node!= null){
            while(node.left != null){
                node = node.left;
            }
            return node;
        }

        Node successor= null;
        while(root != null){
            if(p.item < root.item){
                successor = root;
                root = root.left;
            }else if(p.item > root.item){
                root = root.right;
            }else{
                break;
            }
        }
        return successor;
    }
}
