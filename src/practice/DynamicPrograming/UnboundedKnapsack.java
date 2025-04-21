package practice.DynamicPrograming;

import java.util.HashMap;
import java.util.Map;

public class UnboundedKnapsack {
    static Map<String, Integer> memo = new HashMap<>();
    public static int unboundKnapsack(int capacity, int[] values,int i, int[] weights){
        if(i == values.length || capacity ==0){
            return 0;
        }
        String key = i + "_" + capacity;
        if(memo.containsKey(key)) return memo.get(key);

        int notTake = unboundKnapsack(capacity, values, i+1, weights);

        int take = 0;

        if(weights[i] <= capacity){
            take = values[i] + unboundKnapsack(capacity-weights[i], values, i, weights);
        }
        int result = Integer.max(take, notTake);
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args){
        int [] values  = {10, 40, 50, 70};
        int [] weights = {1,  3,  4,  5};
        int capacity = 8;
        System.out.println(unboundKnapsack(capacity, values,0, weights));
    }
}
