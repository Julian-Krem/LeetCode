package org.example;

import java.util.Stack;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/valid-parentheses/description/*/
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        /*Conditions:
        * 1 - Open brackets must be closed by the same type of brackets.
          2 - Open brackets must be closed in the correct order.
          3 - Every close bracket has a corresponding open bracket of the same type.*/

        /* If the length of the provided string is an odd number -  there is no way for condition 3 to be met:*/
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stackOfCharacters = new Stack<>();
        boolean isValidParentheses = true;
        for (int i = 0; i < s.length(); i++) {
            if (isOpeningCharacter(s.charAt(i))) {
                stackOfCharacters.push(s.charAt(i));
            } else {
                if (stackOfCharacters.isEmpty()) {
                    return false;
                } else if (s.charAt(i) == ')' && stackOfCharacters.pop() != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && stackOfCharacters.pop() != '{') {
                    return false;
                } else if (s.charAt(i) == ']' && stackOfCharacters.pop() != '[') {
                    return false;
                }
            }
        }

        if(!stackOfCharacters.isEmpty()){
            return false;
        }
        return isValidParentheses;
    }

    private static boolean isOpeningCharacter(Character character) {
        if (character == '('
                || character == '{'
                || character == '[') {
            return true;
        }
        return false;
    }
}