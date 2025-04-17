package practice.DynamicPrograming;

public class TwoDTraversalPaths {
    public static int bottomUp(int[][] list){
        int M = list.length, N = list[0].length;
        int[][] countWays = new int[N][M];
        for(int i=0; i< N; i++){
            for(int j=0; j< M; j++){
                countWays[i][j] = 0;
            }
        }
        if(list[0][0] == -1 || list[N-1][M-1] == -1){
            return 0;
        }

        countWays[0][0] = 1;

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++){
                if(list[i][j] == -1) continue;
                if(i-1>=0 && list[i-1][j] != -1){
                    countWays[i][j] += countWays[i-1][j];
                }if(j-1>=0 && list[i][j-1] != -1){
                    countWays[i][j] += countWays[i][j-1];
                }
            }
        }
        return countWays[N-1][M-1];
    }

    public static void main(String[] args){
        int[][] list = {{1,7,9,2},
                {8,6,3,2},
                {1,6,7,8},
                {2,9,8,2}};
        System.out.println(bottomUp(list));
    }
}
