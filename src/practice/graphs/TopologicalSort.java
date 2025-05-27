package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
    private static void dfs(int node, boolean vis[], Stack<Integer> stack, ArrayList<ArrayList<Integer>> adj){
        vis[node] = true;
        for(int it: adj.get(node)){
            if(!vis[it]){
                dfs(it, vis, stack, adj);
            }
        }
        stack.push(node);
    }

    public static int[] topSort(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< V; i++){
            if(!vis[i]){
                dfs(i, vis, stack, adj);
            }
        }

        int[] ans = new int[V];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++] = stack.pop();
        }
        return ans;
    }
}
