package practice.twoPointers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZerosToEnd {
    /*
    * Good stuff! However, initial order of elements is not preserved
    * Also, we run the risk of performing more swaps than it is needful,
    * since swaps are performed when both start and stop are 0*/
    public static int[] moveZeros(int[] list){
        int start = 0;
        int stop = list.length-1;
        while(start < stop){
            if(list[start] == 0){
                if(list[stop] == 0){
                    stop--;
                }
                int temp = list[start];
                list[start] = list[stop];
                list[stop] = temp;
                stop--;
            }
            start++;
        }
        return list;
    }

    public static int[]moveZerosOptimized(int[] list){
        int j=0;
        for(int i=0; i< list.length; i++){
            if(list[i] !=0){
                if(i != j){
                    list[j] = list[i];
                    list[i] = 0;
                }
                j = j+1;
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] list = new int[] {0,1,0,3,12};
//        System.out.println(Arrays.toString(moveZeros(Arrays.copyOf(list))));
        System.out.println(Arrays.toString(moveZerosOptimized(list)));
    }
}
