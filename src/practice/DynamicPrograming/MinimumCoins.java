package practice.DynamicPrograming;

import java.util.HashMap;
import java.util.Map;

public class MinimumCoins {
    static int answer = Integer.MAX_VALUE;
    static Map<Integer, Integer> memo = new HashMap<>();
    public static int recursion(int target, int[] coins){
        if (memo.get(target) != null){
            return memo.get(target);
        }
        if(target == 0){
            answer = 0;
        }
        for(int coin: coins){
            int subProblem = target - coin;
            if (subProblem < 0){
                continue;
            }
            answer = Integer.min(answer, recursion(subProblem, coins) +1);
        }
        memo.put(target, answer);
        return answer;
    }

    public static void main(String[] args){
        int[] coins= new int[] {1, 4, 5};
        System.out.println(recursion(8, coins));
    }
}
