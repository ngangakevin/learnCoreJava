package practice.graphs;

import java.util.Arrays;

public class BellmanFord {
    public static int[] bellmanFord(int V, int[][] edges, int src){
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i=0; i<V; i++){
            for(int[] edge: edges){
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    if(i==V-1) return new int[]{-1};
                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist;
    }
    // Initial distance from source to all other nodes is unknown
}
