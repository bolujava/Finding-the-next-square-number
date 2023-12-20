package org.example;

public class NewAlgo {
    public static long findNextsquare(long num){
        //AIM: find if it is a perfect square;
        //find the root of the num and immediately add one to it.
        //square the result addendum;

        long aNumSqrt = (long)Math.sqrt(num);
        if (aNumSqrt * aNumSqrt == num){
            long nextNum = (long) Math.pow(aNumSqrt + 1, 2);
            return nextNum;
            }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findNextsquare(72));
    }
    }

