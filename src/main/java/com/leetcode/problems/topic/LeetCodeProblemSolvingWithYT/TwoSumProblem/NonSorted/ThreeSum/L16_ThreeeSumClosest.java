package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.ThreeSum;

import static java.lang.Math.abs;

public class L16_ThreeeSumClosest {
    public static void main(String[] args) {
        // given array: -1, 2 ,1, 4
        // target 1
        // We need to find 3 numbers which sum is closest to target.
        //ex: -1 +2 +1 = 2 which is closes to target.
        // As index are not demanded: we need to sort the array in case of 3 sum questions
        // so we can use 2 pointer algorithm


        int a[] = {-1, 2, 1 ,4};
        int target =1;
        System.out.println(closestSum(a, target));
    }

    private static int  closestSum(int[] a, int target) {

        int closestSum = Integer.MAX_VALUE;
        for(int k = 0; k < a.length-3; k++)
        {
            int i = k+1;
            int j= a.length-1;
            while(i < j)
            {
               int  sum = a[k]+ a[i] + a[j];
               if (abs(target-sum) < abs(target-closestSum))
               {
                   closestSum = sum;
               }
               if (sum < target)
               {
                   i++;
               }
               else
               {
                   j--;
               }
            }

        }
        return closestSum;
    }
}
