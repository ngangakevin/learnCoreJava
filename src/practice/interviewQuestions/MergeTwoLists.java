package practice.interviewQuestions;

import java.util.*;

public class MergeTwoLists {
    public static void mergeArrays(String[] list1, String[] list2){
        List<String> mergedArr = new ArrayList<>();
        Map<Integer, Integer> test = new HashMap<>();

        mergedArr.addAll(Arrays.asList(list1));
        mergedArr.addAll(Arrays.asList(list2));
        System.out.println(mergedArr);
    }

    public static void mergedList(List<String> list1, List<String> list2){
        List<String> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);
    }

    public static void main(String[] args){

        String[] arr1 = {"abc", "def", "ghi", "jkl"};
        String[] arr2 = {"mno", "pqr", "stu", "vwx"};
        mergeArrays(arr1, arr2);
        mergedList(Arrays.asList(arr1), Arrays.asList(arr2));
    }
}
