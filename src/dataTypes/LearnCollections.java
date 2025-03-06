package dataTypes;

import java.util.ArrayList;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(22);
        numList.add(54);
        System.out.println(numList);
        int firstNum = numList.getFirst();
        System.out.println(firstNum);
    }
}