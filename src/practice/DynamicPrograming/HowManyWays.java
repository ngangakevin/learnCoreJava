package practice.DynamicPrograming;

import java.util.HashMap;

public class HowManyWays {
    static int ways;
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int countWays(int target, int[] values){
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        if(target == 0){
            return 1;
        }
        if(target < 0){
            return 0;
        }
        for(int value: values){
            int remaining = target-value;
            ways += countWays(remaining, values);
        }
        memo.put(target, ways);
        return ways;
    }

    public static void main(String[] args){
//        System.out.println(countWays(5, new int[] {1,4,5}));
        System.out.println(countWays(5, new int[] {1, 2, 3}));
    }

}
