package practice.DynamicPrograming;

public class MinCost2DTraversal {
    /*
    * Given a cost matrix
    * cost[][] = {
    * {1,7,9,2},
    * {8,6,3,2},
    * {1,6,7,8},
    * {2,9,8,2}}
    * Find the minimum cost of traversing to the end of the list.
    *
    * Use an auxiliary memo array of 2 dimensions int[][] minCost
    * to get to any point (i, j), the current cost is equivalent to the
    * sum of the current point and the minValue of the last 2 points. ie,
    * minCost[i][j] = min(minCost[i-1][j], minCost[i][j-1]) + cost[i][j]
    *
    * Entry criteria
    * at point cost(0,0) currCost = integer.MaxValue
    *
     */

    public static int bottomUp(int[][] cost){
        int M = cost.length , N = cost[0].length;
        int[][] minCost = new int[N][M];
        for(int i=0; i< N ; i++){
            for(int j=0; j<M; j++){
                minCost[i][j] = 0;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                int currCost = Integer.MAX_VALUE;
                if(i-1 >= 0){
                    currCost = Integer.min(currCost, minCost[i-1][j]);
                }
                if(j-1 >=0){
                    currCost = Integer.min(currCost, minCost[i][j-1]);
                }

                if(currCost == Integer.MAX_VALUE){
                    minCost[i][j] = cost[i][j];
                    continue;
                }
                minCost[i][j] = currCost + cost[i][j];
            }
        }
        return minCost[N-1][M-1];
    }

    public static void main(String[] args){
        int[][] cost= {
                {1,0,9,2},
                {8,0,3,2},
                {1,6,0,8},
                {2,9,0,2}};
    System.out.println(bottomUp(cost));
    }
}
