package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/*/
public class FirstOccurenceInAString {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));

    }


    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }
        int result = -1;
        for (int i = 0; i < (haystack.length() + 1) - needle.length(); i++) {
            String subString = haystack.substring(i, i + needle.length());
            if (subString.equals(needle)) {
                result = i;
                break;
            }
        }
        return result;
    }
}