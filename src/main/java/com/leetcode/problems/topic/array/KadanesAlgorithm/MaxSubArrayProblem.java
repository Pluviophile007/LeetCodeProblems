package com.leetcode.problems.topic.array.KadanesAlgorithm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaxSubArrayProblem {
    public static void main(String[] args) {
        int[] array = {1,2,-8,7,3,1,-1};
        bruteForceApproach(array);

    }

    private static void bruteForceApproach(int[] array) {

        Map<Integer, StringBuilder> map = new TreeMap<>();
        Map<Integer, StringBuilder> map1 = new LinkedHashMap<>();
//        int[] array = {1,2,-8,7,3,1,-1};
        for (int i =0; i< array.length-1; i++)
        {
            int sum = array[i];
            var sb  = new StringBuilder();
            sb = sb.append(array[i]);
//            System.out.println("String = "+sb);
            for (int j=i+1; j<array.length; j++)
            {
//                System.out.println("index i= "+i+"  index j = "+j);
//                System.out.println("array["+i+"]  -->   array[= "+j+"]");
                sum = sum+array[j];
                sb = sb.append(",").append(array[j]);
                System.out.println("Sum = "+ sum + "  STring = "+sb);
                map.put(sum, sb);
                map1.put(sum, sb);
//                System.out.println("Sum = "+sum);
//                map.forEach((key, value)-> System.out.println(key +"  "+value));
            }
            System.out.println("****************************");

        }
//        map.forEach((key, value)-> System.out.println(key +"  "+value));
        map1.forEach((key, value)-> System.out.println(key +"  "+value));
    }


}
