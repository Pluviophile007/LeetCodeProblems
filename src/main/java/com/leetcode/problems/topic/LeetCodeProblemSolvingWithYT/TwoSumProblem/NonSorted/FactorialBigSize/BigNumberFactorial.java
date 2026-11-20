package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.FactorialBigSize;

import java.util.Arrays;

public class BigNumberFactorial {
    public static void main(String[] args) {
        int fact = 10;
        Integer arr[] = new Integer[10000];

        arr[0] = 1;
        int []size =  new int[1];
        size[0] = 1;
        for(int multiplier = 2 ; multiplier <= fact; multiplier++)
        {
            multiply(multiplier, arr, size);
        }

        for(int index = size[0]-1; index >= 0; index--)
        {
            System.out.print(" "+ arr[index]);
        }
    }

    private static void multiply(int multiplier, Integer[] arr, int[] size) {

        int result = 1;
        int carry = 0;
        int i=0;
        for(; i< size[0]; i++)
        {
        result  = multiplier * arr[i];
        result = result+carry;
        arr[i] = result%10;
        carry  = result/10;
        }
        while (carry > 0)
        {
            arr[size[0]] = carry % 10;
            size[0]++;
            carry = carry/10;
        }
//        System.out.println(Arrays.toString(arr));
    }
}
