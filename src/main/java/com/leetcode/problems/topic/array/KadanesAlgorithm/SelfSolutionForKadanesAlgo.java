package com.leetcode.problems.topic.array.KadanesAlgorithm;

import java.util.List;

public class SelfSolutionForKadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        maxSumSubarray(arr);

    }

    private static void maxSumSubarray(int[] arr) {

        int maxContinue = arr[0];
        int maxSum = arr[0];
        int currIndex = 0;
        int lastIndex = 0;
        for(int i =1; i< arr.length; i++)
        {
            if(maxContinue + arr[i] < arr[i])
            {
                maxContinue = arr[i];
                currIndex= i;
            }
            else {
                maxContinue = maxContinue + arr[i];
            }

            if (maxSum < maxContinue )
            {
                maxSum = maxContinue;

                lastIndex = i;
            }

        }


        for(int i = currIndex; i<= lastIndex  ; i++)
            System.out.println(arr[i]);

    }
}

