package practice.interviewQuestions;

import java.util.*;


public class CheckListDuplication {
//    This presents an issue, when a list contains duplicates in within itself.
    public static boolean setCheck (int[] list1, int[] list2){
        Set<Integer> set = new HashSet<>();
        for(int i: list1){
            set.add(i);
        }
        for(int j: list2){
            set.add(j);
        }
        return set.size() == (list2.length + list1.length);
    }

    public static boolean improvedSetCheck(int[] list1, int[] list2){
        Set<Integer> set = new HashSet<>();
        for(int i: list1){
            set.add(i);
        }
        for(int j: list2){
            if(set.contains(j)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.print(improvedSetCheck(new int[]{1,1,1,1,2}, new int[] {2,3,4,5,6,7,8,9}));
    }
}
