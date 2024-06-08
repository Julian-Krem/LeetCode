package org.example;


import java.util.Arrays;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/two-sum/description/?source=submission-ac*/
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int[] subarray = Arrays.copyOfRange(nums, i + 1, nums.length);
            for (int j = 0; j < subarray.length; j++) {
                if (nums[i] + subarray[j] == target) {
                    result[0] = i;
                    result[1] = j + (i + 1);
                }
            }
        }
        return result;
    }
}