package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.TwoSum;

import java.util.HashMap;

public class TwoSumUnSorted {
    public static void main(String[] args) {
        int num[]={2,7,19,3};

        var cache = new HashMap<Integer, Integer>();
        int sum = 5;
        int first=0, last =0;
        for(int i = 0; i<= num.length-1; i++)
        {
            if (cache.containsKey(sum-num[i]))
            {
                first = i;
                last = cache.get(sum-num[i]);
                break;
            }
            cache.put(num[i], i);
        }
        System.out.println("First = "+ first+ " last = "+ last);
    }
}
