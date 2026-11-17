package com.leetcode.problems.topic.array.KadanesAlgorithm;

public class PrintSubArrrayWithMaxSum {
    public static void main(String[] args) {
        int array[] = {2, 3, -8, 7, -1, 2, 3};

        int maxSum = 0;
        int begin = 0;
        int end = 0;
        int lastSum = 0;
        for(int i = 0; i< array.length; i++)
        {
            lastSum = maxSum;
            maxSum = maxSum + array[i];

            if(lastSum > maxSum)
            {
                begin = i;

            }
            end  = i;


        }
        System.out.println("BEGINE = "+begin+ " END = "+end);

    }
}
