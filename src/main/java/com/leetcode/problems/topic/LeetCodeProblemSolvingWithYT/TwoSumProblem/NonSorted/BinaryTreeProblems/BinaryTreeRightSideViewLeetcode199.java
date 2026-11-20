package com.leetcode.problems.topic.LeetCodeProblemSolvingWithYT.TwoSumProblem.NonSorted.BinaryTreeProblems;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// Video : https://www.youtube.com/watch?v=IZ1asDkWg34
// Video: https://www.youtube.com/watch?v=-Qs1T_xfzLo&t=374s
public class BinaryTreeRightSideViewLeetcode199 {
    public static void main(String[] args) {
//        usingArrayRepresentation();
        // using Level Order Traversal

        // using PreOrderTraversal->


// Please note below will not work as It will not cover every scenario

        Node root = createTreeAndReturnRoot();

        // preOrderRightViewTraversal(root);
        // Level Order Traversal

//        levelOrderButFailedApproach(root);

        levelOrderSuccessfulApproachForRightSideView(root);
        
        viaPreOrderTraversalRightSideView(root);
    }

    private static void viaPreOrderTraversalRightSideView(Node root) {
        List<Integer> result = new ArrayList<>();
        preOrderTraversalByRightViewLogic(root, 1, result);
        System.out.println(result);
    }

    private static void preOrderTraversalByRightViewLogic(Node root, int level, List<Integer> result) {
        if (root == null)
            return;

        if (result.size() < level)
        {
            result.add(root.data);
        }

        preOrderTraversalByRightViewLogic(root.right, level+1, result);
        preOrderTraversalByRightViewLogic(root.left, level+1, result);

    }

    /**
     * Original Traversal
     * @param root RootNode
     */
    private static void preOrderTraversal(Node root) {
        if (root == null)
        {
            return;
        }
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    private static void levelOrderSuccessfulApproachForRightSideView(Node root) {
//        levelOrderTraversal(root);

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Node extracted = null;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            while(size > 0) {
                extracted = queue.poll();

                if(extracted!=null) {
                    if(extracted.left!= null)
                        queue.add(extracted.left);

                    if(extracted.right!= null)
                        queue.add(extracted.right);
                }
                size --;
            }
            System.out.println(extracted.data);
        }
    }

    private static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            if(node!=null) {
                if(node.left!= null)
                queue.add(node.left);

                if(node.right!= null)
                queue.add(node.right);
            }
            System.out.println(node.data);
        }
    }

    private static void levelOrderButFailedApproach(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            if(null!= node) {
                System.out.println(node.data);
                if (null!= node.right)
                queue.add(node.right);
            }
        }
    }

    private static Node createTreeAndReturnRoot() {
        Node root = new Node();
        root.data=1;

        Node two = new Node();
        two.data =2;
        two.left = null;
        root.left = two;

        Node three = new Node();
        three.data =3;
        three.left = null;
        root.right  = three;

        Node five = new Node();
        five.data =5;
        five.left = null;
        two.right = five;

        Node four = new Node();
        four.data =4;
        three.right  = four;
        return root;
    }

    private static void preOrderRightViewTraversal(Node root) {

        if (root == null)
        {
            return;
        }

        System.out.println(root.data);
        preOrderRightViewTraversal(root.right);
    }

    static class Node {
        int data;
        Node left;
        Node right;
    }

    private static void usingArrayRepresentation() {
        Integer a[] = {1, 2, 3, null, 5, null, 4};
        //Output 1,3, 4
        // Level Order Traversal

        // LevelOrderTraversal: -> Queue me jo last node hoga vahi answer hoga
        // Simple Formula Array based Binary Tree representation for Right View
        int i =0;
        for(i = 0; i <= a.length-1; i= 2*i+2)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");

        // Left View of Binary Tree.
        for(i = 0; i <= a.length-1; i= 2*i+1)
        {
            System.out.print(a[i]+" ");
        }
    }
}
