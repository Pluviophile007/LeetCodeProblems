package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletWhoseSum0NoDuplicate {
    public static void main(String[] args) {
        int a[] = {-4, -1, -1, 0 , 1, 0, 2, 2};
        int target = 0;
        // No Duplicate response in answer
        // Remember when they ask for index, we can't sort
        // But when they ask elements, we can sort
        // Just assume: n1+n2+n3 =
        // a.length-3 beacuse triplet 3 items needed
        int first;
        int second;
        int third;
        if (a.length < 3)
        {
            System.out.println("Not allowed");
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        List<List<Integer>>  allTriplet = new ArrayList<>();
        for (int i = 0; i <= a.length - 3; i++)
        {
            if(i > 0 && a[i] == a[i-1])
                continue;

            first = a[i];
            //Soritng: Merge Sort : O(nlogn)

             List<List<Integer>> triplet = twoSumArray(a, -first, i+1);

            System.out.println(triplet);
        }

    }

    private static List<List<Integer>> twoSumArray(int[] a, int target, int start) {
        int sum = 0;
        int i = start;
        int j = a.length-1;
        boolean found = false;
        List<List<Integer>> triplets = new ArrayList<>();
        System.out.println(" 2 Sum Array Target = "+target);
        while (i<j)
        {
            sum = a[i]+a[j];
            if (sum < target)
                i++;
            else if(sum > target)
                j--;

           else {
            while (i < j && a[i] == a[i + 1])
                i++;

            while (i < j && a[j] == a[j - 1])
                j--;

                triplets.add(List.of(-target, a[i], a[j]));

            // We got the answer
            i++;  //For index purpose
            j--;  // For index purpose
        }
        }
    return triplets;
    }

}
