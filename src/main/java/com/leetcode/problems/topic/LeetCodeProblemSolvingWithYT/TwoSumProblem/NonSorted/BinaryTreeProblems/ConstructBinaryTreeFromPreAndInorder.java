package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.BinaryTreeProblems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

//Video Link:   https://www.youtube.com/watch?v=G5c1wM3Kpuw
public class ConstructBinaryTreeFromPreAndInorder {
    public static void main(String[] args) {
        //preOrder  3,9, 20, 15, 7
        //inOrder: 9,3, 15, 20, 7
        //InOrder: will give you hint of left child and right child ag
        // PreOrder will give you first node is root tree
        // consutruct binary tree:

        int []preOrder = {3,9,20,15,7};
        int []inOrder = {9,3,15,20,7};

        int n = preOrder.length; //As both preOrder and inorder will be same
        int idx = 0; //As 0th index in preOrder is root node// idx is only for root node in preorder
        System.out.println("Main Program Started index of root node of preOrder Array  {3,9,20,15,7} = "+idx);
        BinaryTree root = solve(preOrder, inOrder, 0, preOrder.length-1, idx);
        System.out.println("Root Element Output  = "+root.data);
        printBinaryTree(root);// levelOrderTraversal
    }


    private static BinaryTree solve(int[] preOrder, int[] inOrder, int start, int end, int idx) {
        if(start > end) {
            System.out.println("Terminate recursion as start = "+start + "  end = "+end);
            return null;
        }

        // Find root node which is in preOrder
        int rootVal = preOrder[idx];
        System.out.println("Root Value in PreOrder  [3,9, 20, 15, 7]  = " +rootVal +" index= "+idx);
        // Get index of root Node in InOrder
        int i = start;
        System.out.println(" Starting point to search in in order = [9,3, 15, 20, 7] = "+start);
        System.out.println(" end point = "+end);
        //preOrder  [3,9, 20, 15, 7]
        //inOrder: [9,3, 15, 20, 7]
        for(; i<= end; i++)
        {
            if (rootVal == inOrder[i])
            {
                System.out.println("Inorder [9,3, 15, 20, 7] Index of root "+ rootVal +" = " + i);
                break;
            }
        }
        if(i > end)
            System.out.println("Root not found in Inorder [9,3, 15, 20, 7] ");

        System.out.println("current  index  i = "+ i);

        idx++;  // as it denotes to root node and in preOrder identification

        System.out.println("Incrementing next root to be explored   idx  = "+ idx);

        BinaryTree root = new BinaryTree();
        System.out.println("Agian exploring for rootVal = "+rootVal);
        root.data = rootVal;
        System.out.println("        //preOrder  [3,9, 20, 15, 7]\n" +
                "        //inOrder: [9,3, 15, 20, 7] exploring left Part for rootVal = "+rootVal+ " and start= "+(i+1)+ "  and end = "+end + "next root index = "+idx);
        root.left = solve(preOrder, inOrder, start, i-1, idx);
        System.out.println("        //preOrder  [3,9, 20, 15, 7]\n" +
                "        //inOrder: [9,3, 15, 20, 7] exploring right Part for rootVal = "+rootVal+ " and start= "+(i+1)+ "  and end = "+end + "next root index = "+idx);
        root.right = solve(preOrder, inOrder, i+1, end, ++idx);
        return root;
    }

    static class BinaryTree
    {
        int data;
        BinaryTree left;
        BinaryTree right;
    }


    private static void printBinaryTree(BinaryTree root) {
        Queue<BinaryTree> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            BinaryTree node = queue.poll();
            if(node!=null) {
                if(node.left!= null)
                    queue.add(node.left);

                if(node.right!= null)
                    queue.add(node.right);
            }
            System.out.println(node.data);
        }
    }
}
