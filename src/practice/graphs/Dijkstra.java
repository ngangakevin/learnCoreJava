package practice.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    private static ArrayList<ArrayList<ArrayList<Integer>>> constructAdj(int[][] edges, int vertex){
        ArrayList<ArrayList<ArrayList<Integer>>> res = new ArrayList<>();
        for(int i=0; i<vertex; i++){
            res.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            ArrayList<Integer> e1 = new ArrayList<>();
            e1.add(v);
            e1.add(wt);
            res.get(u).add(e1);

            ArrayList<Integer> e2 = new ArrayList<>();
            e2.add(v);
            e2.add(wt);
            res.get(v).add(e2);
        }
        return res;
    }
    public static int[] dijkstra(int V, int[][] edges, int source){
        //create an adjacency list to capture all nodes adjacent to v;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = constructAdj(edges, V);

        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(ArrayList::getFirst));

        //initialize all distances to infinity; The first distance, (from src to src is 0)
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        ArrayList<Integer> start = new ArrayList<>();

        start.add(0);
        start.add(source);
        pq.offer(start);

        while(!pq.isEmpty()){
            ArrayList<Integer> curr = pq.poll();
            int d = curr.get(0);
            int u = curr.get(1);

            for(ArrayList<Integer> neighbor: adj.get(u)){
                int v = neighbor.get(0);
                int weight = neighbor.get(1);

                if(dist[v] > dist[u] + weight){
                    dist[v] = dist[u] + weight;

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(dist[v]);
                    temp.add(v);
                    pq.offer(temp);
                }
            }
        }
        return dist;
}
}
