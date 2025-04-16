package practice.DynamicPrograming;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
    public static int coinChangeRecursion(int[] coins, int index, int sum){
        if(sum == 0){
            return 1;
        }
        if(sum < 0 || index == coins.length){
            return 0;
        }

        int include = coinChangeRecursion(coins, index, sum - coins[index]);
        int exclude = coinChangeRecursion(coins, index+1, sum);

        return include+exclude;
    }

    public static int coinChangeTD(int[] coins, int sum){
        Map<String, Integer> memo = new HashMap<>();
        return coinChangeTD(coins, 0, sum, memo);
    }

    public static int coinChangeTD(int[] coins, int index, int sum, Map<String, Integer> memo){
        if(sum == 0){
            return 1;
        }if(sum < 0 || index ==coins.length){
            return 0;
        }
        String key = index + "-" + sum;
        if(memo.containsKey(key)){
            return memo.get(key);
        };

        int include = coinChangeTD(coins, index, sum - coins[index], memo);
        int exclude = coinChangeTD(coins, index+1, sum, memo);
        memo.put(key, include+exclude);
        return memo.get(key);
    }

    public static int coinChangeBP(int[] coins, int sum){
        int n = coins.length;
        int [][] memo = new int[n+1][sum+1];

        memo[0][0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j <= sum; j++){
                //select item i
                memo[i][j] += memo[i-1][j];
                //selection without item i.
                if((j - coins[i-1]) >= 0){
                    memo[i][j] += memo[i][j-coins[i-1]];
                }
            }
        }
        return memo[n][sum];
    }


    public static void main(String[] args){
        System.out.println(coinChangeBP(new int[] {1,2,3},4));
    }
}
