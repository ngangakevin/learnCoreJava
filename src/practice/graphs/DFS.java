package practice.graphs;

import java.util.ArrayList;

public class DFS {
    public static void dfs(int[][] adj, ArrayList<Integer> res, int s, boolean[] visited ){
        visited[s] = true;
        res.add(s);
        for(int i: adj[s]){
            if(!visited[i]) dfs(adj, res, i, visited);
        }
    }

    public static ArrayList<Integer> dfs(int[][] adj){
        boolean[] visited = new boolean[adj.length];
        ArrayList<Integer> res = new ArrayList<>();
        dfs(adj, res, 0, visited);
        return res;
    }

    public static void main(String[] args){
        int[][] adj = new int[][] {new int[] {0,1}, new int[] {0,2}, new int[] {1, 2}, new int[] {2, 3}, new int[] {2, 4}};
        System.out.println(dfs(adj));
    }
}

