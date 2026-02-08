package com.leetcode.problems.topic.array.KadanesAlgorithm;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KadanesAlgorithm {

    public static void main(String[] args) {

        int[] array = {1,2,-8,7,3,1,-1};
        List<Integer> items = kadanesAlgorithm(array);
//        System.out.println("Sum = "+items.get(0)+ "startIndex = "+items.get(1)+" endIndex = "+items.get(2));
    }

    private static List<Integer> kadanesAlgorithm(int[] array) {
        List<Integer> items = new ArrayList<>(3);

        int sum = 0;
        int startIndex = 0;
        int endIndex =0;
        int max  = Integer.MIN_VALUE;
        for( int i =0; i< array.length; i++)
        {

            if (sum < 0 )
            {
                sum = 0;
                max = Integer.MIN_VALUE;
                startIndex = i;
            }
            sum = sum+array[i];

            if (max<=sum)
            {
                max = sum ;
                endIndex = i;
            }
        }

        System.out.println("Max sum = "+max);
        System.out.println("StartIndex = "+startIndex);
        System.out.println("EndIndex = "+ endIndex);
        return Collections.EMPTY_LIST;
    }


}
