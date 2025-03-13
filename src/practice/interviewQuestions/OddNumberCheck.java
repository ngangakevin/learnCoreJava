package practice.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class OddNumberCheck {
    public static boolean isOdd(List<Integer> list){
        for(int i: list){
            if (i%2 == 0) return false;
        }
        return true;
    }

    public static boolean parallelIsOdd(List<Integer> list) {
        return list.stream().parallel().noneMatch(x-> x%2 ==0);
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(parallelIsOdd(list));
    }
}
