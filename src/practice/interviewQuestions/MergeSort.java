package practice.interviewQuestions;

import java.util.Arrays;

public class MergeSort {
/*    Sorting algorithm that does recursion, up to the last element.
       A list of one element will always be sorted. Question is how is it co-joined back with the other list?
       An idea would be to do a comparison of list1[-1] and list2[0], and concatenate appropriately.
       The time complexity is 0(nlogn) for each item, we will merge with a split list of the recursed array
 */
    public static int[] mergeTwoArrays(int[] first, int[] second){
        int[] sorted = new int[first.length + second.length];
        int i=0; int j = 0; int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                sorted[k] = first[i];
                k++;
                i++;
            }else{
                sorted[k] = second[j];
                k++;
                j++;
            }
        }

        if(i == first.length){
            while(j< second.length){
                sorted[k] = second[j];
                k++;
                j++;
            }
        }
        if(j == second.length){
            while(i < first.length){
                sorted[k] = first[i];
                k++;
                i++;
            }
        }
        return sorted;
    }
    public static int[] mergeSort(int low, int high, int[] list){
        if(low == high){
            return new int[] {list[low]};
        }else{
            int mid = low + (high-low)/2;
            int[] fh = mergeSort(low, mid, list);
            int[] sh = mergeSort(mid+1, high, list);
            return mergeTwoArrays(fh, sh);
        }
    }
    public static int[] mergeSort(int[] list){
        int low = 0;
        int high = list.length -1;
        return mergeSort(low, high, list);
    }

    public static void main(String[] args){
        int[] list = {5,4,3,2,6,7,8,9,0};
        System.out.print(Arrays.toString(mergeSort(list)));
    }
}
