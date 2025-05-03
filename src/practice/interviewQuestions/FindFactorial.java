package practice.interviewQuestions;

import java.util.Arrays;

public class FindFactorial {
    public static int loopFactorial(int num){
        int result = 1;
        while(num > 1){
            result = result * num;
            num --;
        }
        return result;
    }

    public static int recursive(int num){
        if(num == 1){
            return num;
        }if(num ==0){
            return 1;
        }
        return num * recursive(num-1);
    }

    public static int factorialBU(int num){
        int[] fact = new int[num+1];
        fact[0] = 1;
        fact[1] = 1;
        for(int i=2; i<=num; i++){
            fact[i] = fact[i-1] * i;
        }
        System.out.println(Arrays.toString(fact));
        return fact[num];
    }

    public static void main(String[] args){
        System.out.println(recursive(12));
        System.out.println(factorialBU(10));
    }
}
