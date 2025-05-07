package practice.DynamicPrograming.Knapsack;

public class Bounded01 {
    public int bruteForce(int[] profits, int[] weights, int capacity){
        return bruteForce(profits, weights, capacity, 0);
    }

    public int bruteForce(int[] profits, int[] weights, int capacity, int currIndex){
        if(capacity <=0|| currIndex >= profits.length){
            return 0;
        }
        int profit1=0;
        if(weights[currIndex] <= capacity) {
            //profit including current index
            profit1 += profits[currIndex] +
                    bruteForce(profits, weights, capacity - weights[currIndex], currIndex + 1);
        }
            //profit excluding current index
            int profit2 = bruteForce(profits, weights, capacity, currIndex+1);
            return Integer.max(profit2, profit1);
    }

    public int knapsackTopDown(int[] profits, int[] weights, int capacity){
        Integer[][] memo  = new Integer[weights.length][capacity+1];
        return knapsackTopDown(profits, weights, capacity, memo, 0);
    }

    public int knapsackTopDown(int[] profits, int[] weights, int capacity, Integer[][] memo, int currIndex){
        if(capacity <=0 || currIndex > profits.length){
            return 0;
        }
        if(memo[currIndex][capacity] != null){
            return memo[currIndex][capacity];
        }
        int profit1 = 0;
        if(weights[currIndex] <= capacity) {
            profit1 += profits[currIndex] + knapsackTopDown(
                    profits, weights, capacity - weights[currIndex], memo, currIndex+1);
        }

        int profit2 = knapsackTopDown(profits, weights, capacity, memo, currIndex+1);
        memo[currIndex][capacity] = Math.max(profit2, profit1);
        return memo[currIndex][capacity];
    }

    public int knapsackBottomUp(int[] profits, int[] weights, int capacity){
        if(capacity <= 0 || profits.length == 0 || weights.length != profits.length){
            return 0;
        }

        Integer[][] memo = new Integer[weights.length][capacity];

        for(int c=0; c<=capacity; c++){
            if(weights[0] <= c){
                memo[0][c] = profits[0];
            }
        }

        for(int i=1; i< profits.length;i++){
            for(int c=1; c<=capacity; c++){
                int profit1 = 0, profit2=0;
                if(weights[i] <= c){
                    profit1 = profits[i] + memo[i-1][c-weights[i]];
                }
                profit2 = memo[i-1][c];
                memo[i][c] = Math.max(profit2, profit1);
            }
        }
        return memo[weights.length-1][capacity];
    }
}
