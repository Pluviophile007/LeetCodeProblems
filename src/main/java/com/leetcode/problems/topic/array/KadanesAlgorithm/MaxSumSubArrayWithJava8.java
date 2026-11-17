package com.leetcode.problems.topic.array.KadanesAlgorithm;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxSumSubArrayWithJava8 {
    public static void main(String[] args) {
//       var list =  List.of( 2, 3, -8, 7, -1, 2, 3);
       var list =  List.of( -2, -3, -8, -7, -1, -2, -3);
//       var list =  List.of( 2, 3, -8, 7, -1, 2, 3);

            int maxSum = list.get(0);
            int result = list.get(0);
            int begin=0;
            int end=0;
                for(int i = 1 ; i < list.size(); i ++)
                {
                    int backupSum = maxSum;
                    maxSum = Math.max(maxSum+list.get(i), list.get(i));
                    if(maxSum == list.get(i))
                    {
                        begin = i;
                    }
                    end = i;
                    result = Math.max(maxSum, result);
                }
        System.out.println(result + " BEGIN = "+begin+" , END = "+end);
    }
}
