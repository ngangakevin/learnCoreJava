package practice.interviewQuestions;

import java.util.Arrays;

public class BinarySearch {
    public static int iterativeSearch(int item, int[] sortedList){
        int start = 0;
        int stop = sortedList.length -1;
        while(start < stop){
            int mid = start + (stop-start)/2;
            if(item == sortedList[mid]){
                return mid;
            }else if(item < sortedList[mid]){
                stop = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int recurse(int item, int start, int stop, int[] sortedList){
        if(start > stop){
            return -1;
        }
        int mid = start + (stop - start)/2;
        if(item == sortedList[mid]){
            return mid;
        }else if(item > sortedList[mid]){
            start = mid + 1;
            return recurse(item, start, stop, sortedList);
        }else{
            stop = mid - 1;
            return recurse(item, start, stop, sortedList);
        }
    }
    public static int recursive(int item, int[] sortedList){
        int start = 0;
        int stop = sortedList.length-1;
        return recurse(item, start, stop, sortedList);
    }

    /*
    * @FALSE recursionWithCopy will always be inaccurate hence tagged as a FALSE implementation*/
    public static int recurseWithCopy(int item, int[] sortedList){
        int start = 0;
        int stop = sortedList.length -1;
        int mid = start + (stop - start)/2;
        if(start > stop){
            return -1;
        }
        if(item == sortedList[mid]){
            return mid;
        } else if (item < sortedList[mid]) {
            return recurseWithCopy(item, Arrays.copyOfRange(sortedList, start, mid));
        }else{
            return recurseWithCopy(item, Arrays.copyOfRange(sortedList, mid + 1, stop));
        }
    } /*Creating a copy of the array will always create a problem. This is because after recursion, the list
        will be a new object, and the found element will be on index 0, or in the mid index. Will only return correct
        when the searched item is always in the middle of the list.
        Arrays.copyOfRange will present a problem with big lists, since new list objects are created for each recursion cycle.
    */


    public static void main(String[] args){
        int[] sortedList= {0,1,2,3,5,6,7,8,9,10};
        int item  = 6;
        System.out.println(recurseWithCopy(item, sortedList));
    }
}
