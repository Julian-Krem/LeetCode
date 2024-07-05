package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/plus-one/description/*/
public class PlusOne {
    public static void main(String[] args) {
        int[] array = {9};
        System.out.println(Arrays.toString(plusOne(array)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}