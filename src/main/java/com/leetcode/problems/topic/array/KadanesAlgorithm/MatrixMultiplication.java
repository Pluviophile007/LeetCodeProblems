package com.leetcode.problems.topic.array.KadanesAlgorithm;

class MatrixMultiplication{


    public static void main(String[] args)
    {
        int [][]A = {
                {1,2,3},
                {4,5,6}
        };


        int [][]B = {
                {7,8},
                {9,10},
                {11,12}
        };

        System.out.println(matrixMultiplication(A, B));
    }


    public static int[][] matrixMultiplication(int[][] A, int[][] B)
    {
// put some validation to check if 2D array is not empty
        int rowsA = A.length;
        int colA = A[0].length;

        int rowsB = B.length;
        int colB = B[0].length;

        if (colA != rowsB)
        {

            throw new IllegalArgumentException("Given Matrix has wrong configuration req for multiplication");
        }

        int [][]C = new int[rowsA][colB];

        for (int i=0; i<rowsA; i++)
        {

            for (int j=0; j< colB; j++)
            {
                for(int k=0; k < colA; k++)
                {
                    C[i][j] = C[i][j] +( A[i][k] * B[k][j] );
                }

            }
        }

        for (int i =0; i < C.length; i++)
        {
            for (int j=0; j < C[0].length; j ++)
            {
                System.out.println(C[i][j]);
            }
        }

        return C;
    }


}