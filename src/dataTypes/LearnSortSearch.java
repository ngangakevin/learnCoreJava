package dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnSortSearch {
    public static void main(String[] args) {
        String[] strArray = {"Hello", "hello", "HI", "Hi", "Hello"};

        Arrays.sort(strArray);

        System.out.println(Arrays.toString(strArray));

        System.out.println(Arrays.binarySearch(strArray, "HI"));

        List<Integer> lst = new ArrayList<>();
        lst.add(22);
        lst.add(11);
        lst.add(22);
        lst.add(44);

        Collections.sort(lst);
        System.out.println(lst);

        List<ComparablePerson> pList = new ArrayList<>();
        pList.add(new ComparablePerson("Peter", 22));
        pList.add(new ComparablePerson("Paul", 35));
        pList.add(new ComparablePerson("John", 28));
        System.out.println(pList);
    }
}
