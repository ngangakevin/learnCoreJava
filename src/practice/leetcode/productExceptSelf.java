package practice.leetcode;

import java.util.Arrays;

/*Given an integer array nums, return an array such that answer[i] is equal to the products
 of all elements save from nums[i]
 */
public class productExceptSelf {
    /* solution will not work for arrays with more than one zero.
    *  This is because totalProduct has to be initialized at 1, for all other cases to work.
    * */
    public static int[] arrProduct(int[] nums){
        int totalProduct = 1;
        for(int i: nums){
            if(i != 0){totalProduct = totalProduct * i;}
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){ nums[i] = totalProduct;}
            else{
                nums[i] = totalProduct/nums[i];
            }
        }
        return nums;
    }

    public static int[] arrProductWithZeroes(int[] nums){
        int totalProduct = 1;
        int ZeroCount = 0;

        // calculate totalProduct and Count Zeroes
        for(int num: nums){
            if(num == 0){
                ZeroCount ++;
            }else{
                totalProduct = totalProduct * num;
            }
        }

        for(int i=0; i< nums.length; i++){
            if(ZeroCount > 1){
                nums[i] = 0;
            }else if(ZeroCount ==1){
                nums[i] = (nums[i] == 0)? totalProduct: 0;
            }else{
                nums[i] = totalProduct / nums[i];
            }
        }
        return nums;
    }

    public static void simpleSwap(int i, int j){
        int k = i;
        i = j;
        j = k;
    }

    public static void main(String[] args){
        int [] result = arrProductWithZeroes(new int[] {1,0,0,69});
        int[] test = new int[] {1,2};
        for (int i = 1; i < test.length; i++) {
            simpleSwap(i, i-1);
        }
        System.out.println(Arrays.toString(test));
    }
}
