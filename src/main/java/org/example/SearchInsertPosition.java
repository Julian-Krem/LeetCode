package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/search-insert-position/description/ */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        System.out.println(searchInsert(array, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int arrayStartingIndex = 0;
        int arrayEndingIndex = nums.length - 1;
        while (arrayStartingIndex <= arrayEndingIndex) {
            int midValueOfTheArray = arrayStartingIndex + (arrayEndingIndex - arrayStartingIndex) / 2;
            if (nums[midValueOfTheArray] == target) {
                return midValueOfTheArray;
            }
            if (nums[midValueOfTheArray] < target) {
                arrayStartingIndex = midValueOfTheArray + 1;
            } else {
                arrayEndingIndex = midValueOfTheArray - 1;
            }
        }
        return arrayStartingIndex;
    }
}