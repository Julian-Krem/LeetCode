package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/palindrome-number*/
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder(number);
        String revertedString = sb.reverse().toString();
        return number.equals(revertedString);
    }
}