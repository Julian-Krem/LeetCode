package org.example;

import java.util.Arrays;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/remove-element/*/
public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(array, val));
        System.out.println(Arrays.toString(array));
    }

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}