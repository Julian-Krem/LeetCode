package org.example;

/*TODO - LINK TO THE PROBLEM >>> https://leetcode.com/problems/sqrtx/description/*/
public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static float mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return mySqrt2(0, x, x);
    }

    public static float mySqrt2(float lowerBound, float upperBound, int initialValue) {
        float middleValue = ((upperBound - lowerBound) / 2) + lowerBound;
        if ((middleValue * middleValue) == initialValue) {
            return middleValue;
        }
        if ((upperBound - lowerBound >= 0) && (upperBound - lowerBound <= 0.001)) {
            if (((int) upperBound * (int) upperBound) % initialValue == 0) {
                return upperBound;
            }
            if (((int) lowerBound * (int) lowerBound) % initialValue == 0) {
                return lowerBound;
            }
            return middleValue;
        }
        if (middleValue * middleValue > initialValue) {
            return mySqrt2(lowerBound, middleValue, initialValue);
        }
        return mySqrt2(middleValue, upperBound, initialValue);
    }
}
