package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.TwoSum;

public class SortedArrayNum {
    public static void main(String[] args) {

        mayankApproach();
        simpleApproach();

    }

    private static void simpleApproach() {
        int a[]={2,3,7, 9, 13};
        int i=0, j = a.length-1;
        int target = 5;
        int sum = 0;
        while (i<j)
        {
            sum = a[i]+a[j];
            if (sum < target)
            {
                i++;
            } else if (sum > target)
            {
                j--;
            }
            else {
                break;
            }
        }
        System.out.println("I = "+ ++i + "  J = "+ ++j);
    }

    private static void mayankApproach() {
        int num[]={2,3,7, 9, 13};
        int i = 0;
        int j = num.length-1;
        int first = 0, last = 0;
        int target = 5;
        int sum = 0;
        while (i < num.length && j > 0)
        {
            if (num[i] >= target)
            {
                System.out.println(" Cant be found pair as alone can handle target");
                break;
            }

            if ((sum = num[i]+num[j]) == target)
            {
                System.out.println("Found Target sum");
                break;
            }

            if (num[j] >= target)
            {
                j--;
                continue;
            }
            if(num[i] + num[j] > target)
            {
                i++;
            }
        }
        System.out.println("I = "+ ++i + "  J = "+ ++j); // Soln is O(n)
    }
}
