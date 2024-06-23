package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/*/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {1,1,2};
        System.out.println(removeDuplicates(arrayOfIntegers));
        System.out.println(Arrays.toString(arrayOfIntegers));
    }

    public static int removeDuplicates(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> mapOfUniqueValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mapOfUniqueValues.containsKey(nums[i])) {
                mapOfUniqueValues.put(nums[i],result);
                result++;
            }
        }
        for(Map.Entry<Integer, Integer> entry : mapOfUniqueValues.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            nums[value] = key;
        }
        return result;
    }
}