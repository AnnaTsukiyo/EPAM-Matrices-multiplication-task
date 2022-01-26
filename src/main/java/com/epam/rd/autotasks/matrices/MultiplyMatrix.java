package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int columnsOfFirstMatrix = matrix1[0].length;
        int rowsOfSecondMatrix = matrix2.length;

        if (columnsOfFirstMatrix != rowsOfSecondMatrix) {
            throw new IllegalArgumentException(String.format("Can't multiply matrices, columns of first matrix"
                            + " %d is not equal to rows of second matrix %d",
                    columnsOfFirstMatrix, rowsOfSecondMatrix));
        }

        int rowsOfFirstMatrix = matrix1.length;
        int columnsOfSecondMatrix = matrix2[0].length;
        int[][] product = new int[rowsOfFirstMatrix][columnsOfSecondMatrix];

        for (int i = 0; i < rowsOfFirstMatrix; i++) {
            for (int j = 0; j < columnsOfSecondMatrix; j++) {

                int sum = 0;
                for (int k = 0; k < rowsOfSecondMatrix; k++) {
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }

                product[i][j] = sum;
            }
        }

        return product;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567}};

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6}};

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
