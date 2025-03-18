package practice.interviewQuestions;

import java.util.Arrays;

public class SumIntegers {
    public static void main(String[] integers){
        int[] list = {1,2};

        int result = Arrays.stream(list).sum();
        System.out.print(result);
    }
}
