package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/length-of-last-word/description/*/
public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].trim().length();
    }
}