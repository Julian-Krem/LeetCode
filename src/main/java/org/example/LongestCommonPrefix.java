package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/longest-common-prefix/description/*/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix >>> " + longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int longestStringLength = strs[0].length();
        int indexOfLongestString = 0;
        String longestStringInTheArray = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() > longestStringLength) {
                longestStringLength = strs[i].length();
                longestStringInTheArray = strs[i];
                indexOfLongestString = i;
            }
        }
        for (int i = 0; i < strs.length; i++) {
            if (i == indexOfLongestString) {
                continue;
            }
            while (strs[i].indexOf(longestStringInTheArray) != 0) {
                longestStringInTheArray = longestStringInTheArray.substring(0, longestStringInTheArray.length() - 1);
            }
        }
        return longestStringInTheArray;
    }
}