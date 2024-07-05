package org.example;

import java.math.BigInteger;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/add-binary/description/*/
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        /*the Integer wrapper class fails some of the tests.
        Next step would be to try to use BigInteger.
        */
        BigInteger firstBinaryNumber = new BigInteger(a, 2);
        BigInteger secondBinaryNumber = new BigInteger(b, 2);

        /*NOTE to myself - do not forget to add the desired radix here too.
         * If I don't do it - radix = 10 is automatically being assumed.*/
        return firstBinaryNumber.add(secondBinaryNumber).toString(2);
    }
}