package practice.DynamicPrograming;

import java.util.*;

public class Knapsack {
    public static int result = 0;
    static Map<String, Integer> memo = new HashMap<>();
    public static int solveKnapsack(int capacity, int[] values, int[] weights){
        if(capacity <= 0){
            return 0;
        }if(capacity > 1){
            return 1;
        }
        for(int i = 0; i < values.length; i++){
            int remainingCapacity = capacity - weights[i];
            int[] remainingValues = new int[values.length-1];
            int[] remainingWeights = new int[weights.length-1];
            for(int j = 0; j< values.length; j++){
                if(values[i]==values[j]){
                    continue;
                }else{
                    remainingValues[remainingValues.length-1] = values[j];
                    remainingWeights[remainingWeights.length-1] = weights[j];
                }
            }
            result += solveKnapsack(remainingCapacity, remainingValues, remainingWeights);
        }
        return result;
    }

    public static int knapsackTD1(int capacity, int[] values,int i, int[] weights){
        if(i == weights.length || capacity ==0){
            return 0;
        }
        String key = i + "_" + capacity;
        if(memo.containsKey(key)) return memo.get(key);

        int notTake = knapsackTD1(capacity, values, i+1, weights);

        int take = 0;

        if(weights[i] <= capacity){
            take = values[i] + knapsackTD1(capacity-weights[i], values, i+1, weights);
        }
        int result = Integer.max(take, notTake);
        memo.put(key, result);
        return result;
    }
 public static void main(String[] args){
     int [] values  = {10, 40, 50, 70};
     int [] weights = {1,  3,  4,  5};
     int capacity = 8;
        System.out.println(knapsackTD1(capacity, values,0, weights));
 }
}
