package practice.DynamicPrograming;

public class JumpingFrog {
    public static int bottomUp(int[] heights){
        int prev1=0,prev2=0;
        for(int i=1; i< heights.length; i++){
            int jump1 = prev1 + Math.abs(heights[i] - heights[i-1]);
            int jump2 = Integer.MAX_VALUE;
            if(i-2 > 0){
                jump2 = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            int curr = Math.min(jump1, jump2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
