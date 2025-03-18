package practice.interviewQuestions;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        Random shuffler = new Random();
        for(int i=0; i<arr.length; i++){
/*           instead of a direct modification, store the element in a temp var
             then swap it with i
 */
            int newIndex = shuffler.nextInt(arr.length);
            int item = arr[newIndex];
            arr[newIndex] = arr[i];
            arr[i] = item;
        }
        System.out.println(Arrays.toString(arr));
    }
}
