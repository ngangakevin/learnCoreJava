package practice.twoPointers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates {
    /*
    * given that a list is sorted, remove all duplicates from the array,
    *  then return the length of the result list*/
    public static int removeDuplicates(int[] list){
        int j = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< list.length; i++){
            if(list[i] != list[j]){
                if(i != j){
                    result.add(list[i]);
                    j ++;
                }
            }

        }
        System.out.println(result);
        return result.size();
    }

    public static int correctImpl(int[] list){
        int j=0;
        for(int i=1; i<list.length; i++){
            if(list[i] != list[j]){
                j++;
                list[j] = list[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args){
        int[] list = new int[] {1,2,3,4,5,6,6,6,7,8,8,8,9,10};
        Set<Integer> set = IntStream.of(list).boxed().collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(correctImpl(list));
    }
}
