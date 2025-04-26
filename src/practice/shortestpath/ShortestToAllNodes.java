package practice.shortestpath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestToAllNodes {
    // construct an adjacency matrix using an Arraylist of Arraylist.
    public static ArrayList<ArrayList<ArrayList<Integer>>> constructAdj(int[][] edges, int V) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i=0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            //Add edge from u to v
            ArrayList<Integer> e1 = new ArrayList<>();
            e1.add(v);
            e1.add(wt);
            adj.get(u).add(e1);

            // Since the graph is undirected, add edge from v to u
            ArrayList<Integer> e2 = new ArrayList<>();
            e2.add(u);
            e2.add(wt);
            adj.get(v).add(e2);
        }
        return adj;
    }

    public static int[] dijkstra(int V, int[][] edges, int src){
        // Create an adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = constructAdj(edges, V);

        //Priority queue to store vertices to be processed
        //Each element is a pair: [distance, node]
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(ArrayList::getFirst));

        //Create a distance array and initialize all distances as infinite.
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // Insert source with distance 0
        dist[src] = 0;
        ArrayList<Integer> start = new ArrayList<>();

        start.add(0);
        start.add(src);
        pq.offer(start);

        while(!pq.isEmpty()){
            ArrayList<Integer> curr = pq.poll();
            //d  -> distance
            // u -> item
            int d = curr.get(0);
            int u = curr.get(1);

            //Traverse all adjacent vertices of the current node.
            for(ArrayList<Integer> neighbor : adj.get(u)){
                int v = neighbor.get(0);
                int weight = neighbor.get(1);

                // If there is a shorter path to v through u
                if(dist[v] > dist[u] + weight) {
                    // update distance of v
                    dist[v] = dist[u] + weight;

                    //Add updated pair to the queue
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(dist[v]);
                    temp.add(v);
                    pq.offer(temp);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args){
        int V = 5;
        int src = 0;

        int[][] edges = {
                {0,1,4}, {0,2,8}, {1,4,6},
                {2,3,16}, {3,4,10}
        };

        int[] result = dijkstra(V, edges, src);

        System.out.println(Arrays.toString(result));
    }
}
