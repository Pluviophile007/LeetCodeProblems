package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.L42.TrappingRainWater;

import static java.lang.Math.min;

public class TrappingRainWater {
    public static void main(String[] args) {
        // Heights are given we need to check if rain happens how much water is stored among them
        //  array= 4,2,0,3,2,5
        // Here we can apply the formula:
        // Wi = min(left_max_i, right_max_i) - height i
        // Video:https://www.youtube.com/watch?v=f2QgmVxPiS4
        // We can solve it by DynamicProgramming as well as Stack
        int heights[] = {4,2,0,3,2,5};

        int trappedWater = calculate(heights);
        System.out.println("Trapped water = "+ trappedWater);
    }

    private static int calculate(int[] heights) {
        if (heights.length < 1)
            return -1;

       int sum=0;
        for(int i =0; i < heights.length-1; i++ )
        {
            int leftMax = leftMaxElement(i, heights);
            int rightMax = rightMaxElement(i, heights);
            int trappedWater = min(leftMax, rightMax) - heights[i];
            sum = sum + trappedWater;
        }
        return sum;
    }

    private static int rightMaxElement(int current, int[] heights) {
        int rightMax = heights[heights.length-1];
        for(int i = heights.length-2; i >= 0; i--)
        {
            rightMax =  Math.max(rightMax, heights[i]);
        }
        return rightMax;
    }

    private static int leftMaxElement(int current, int[] heights) {
        int leftMax = heights[0];
        for(int i = 1; i < heights.length-1; i++)
        {
             leftMax =  Math.max(leftMax, heights[i]);
        }
        return leftMax;
    }

}
