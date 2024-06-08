package org.example;

import java.util.HashMap;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/roman-to-integer/description/*/
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> romansToIntegers = new HashMap<>();
        romansToIntegers.put("I", 1);
        romansToIntegers.put("V", 5);
        romansToIntegers.put("X", 10);
        romansToIntegers.put("L", 50);
        romansToIntegers.put("C", 100);
        romansToIntegers.put("D", 500);
        romansToIntegers.put("M", 1000);
        romansToIntegers.put("IX", 9);
        romansToIntegers.put("IV", 4);
        romansToIntegers.put("XL", 40);
        romansToIntegers.put("XC", 90);
        romansToIntegers.put("CD", 400);
        romansToIntegers.put("CM", 900);
        int sum = 0;
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && romansToIntegers.containsKey(s.substring(i, i + 2))) {
                sum += romansToIntegers.get(s.substring(i, i + 2));
                i += 2;
            } else {
                sum += romansToIntegers.get(String.valueOf(s.charAt(i)));
                i++;
            }
        }
        return sum;
    }
}