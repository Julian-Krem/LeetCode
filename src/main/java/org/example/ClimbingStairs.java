package org.example;

/*TODO - LINK TO THE PROBLEM >>> */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }

    public static int climbStairs(int n) {
        return recursive(n, new int[n+1]);
    }

    public static int recursive(int n, int[]array){
        if(n==1 || n == 2){
            array[n] = n;
        }
        else if(array[n] == 0){
            array[n] = recursive(n-1, array) + recursive(n-2, array);
        }

        return array[n];
    }
}