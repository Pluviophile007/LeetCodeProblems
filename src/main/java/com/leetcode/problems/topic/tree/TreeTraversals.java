package com.leetcode.problems.topic.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversals {

    static class Node
    {
        int data;
        Node left;
        Node right;
        boolean isRoot;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        TreeTraversals treeTraversals = new TreeTraversals();
        Node node1 = new Node(1);
        node1.isRoot = true;

        Node node2 = new Node(2);
        node1.left = node2;
        Node node3 = new Node(3);
        node1.right = node3;
        Node node4 = new Node(4);
        node2.left = node4;
        Node node5 = new Node(5);
        node2.right = node5;
        Node node6 = new Node(6);
        node3.left = node6;
        Node node7 = new Node(7);
        node3.right  = node7;

        System.out.println("PRE ORDER TRAVERSAL:--");
        preOrder(node1);
        System.out.println("");
        System.out.println("In  ORDER TRAVERSAL:--");
        inOrder(node1);

        System.out.println("");
        System.out.println("POST  ORDER TRAVERSAL:--");

        postOrder(node1);
        System.out.println("");
        System.out.println("Level ORDER TRAVERSAL:--");
        
        levelOrderTraversal(node1);
    }



    private static void preOrder(Node root) {
        
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    private static void inOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        System.out.print(root.data+" ");
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null)
            return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");
    }


    private static void levelOrderTraversal(Node root)
    {
        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node curr =  queue.poll();

            System.out.print(curr.data+" ");

            if(curr.left != null)
                queue.add(curr.left);

            if(curr.right != null)
                queue.add(curr.right);
        }

    }
}
