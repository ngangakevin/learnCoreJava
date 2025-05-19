package practice.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        return kSum(nums, 0, 0, 3);
    }

    private static List<List<Integer>> kSum(int[] nums, int target, int start, int k){
        List<List<Integer>> result = new ArrayList<>();
        if(start == nums.length){
            return result;
        }

        long average_value = target/k;

        if(nums[start] > average_value || average_value >nums[nums.length-1]){
            return result;
        }

        if(k == 2){
            return twoSum( nums, target, start);
        }

        for(int i = start; i<nums.length; i++){
            if(i== start || nums[i] != nums[i-1]){
                for(List<Integer> subset: kSum(nums, target-nums[i], i+1, k-1)){
                    result.add(new ArrayList<>(List.of(nums[i])));
                    result.getLast().addAll(subset);
                }
            }
        }
        return result;
    }

    private static List<List<Integer>> twoSum(int[] nums, int target, int start){
        List<List<Integer>> res = new ArrayList<>();
        int lo = start, hi = nums.length-1;
        while(lo < hi){
            int currSum = nums[lo] + nums[hi];
            if(currSum < target || (lo > start && nums[lo] == nums[lo-1])){
                ++lo;
            }else if(currSum > target || hi< nums.length-1 && nums[hi] == nums[hi+1]){
                --hi;
            }else{
                res.add(List.of(nums[lo++],nums[hi++]));
            }
        }
        return res;
    }
}