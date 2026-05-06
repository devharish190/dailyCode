/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge;

/**
 *
 * @author Admin
 */
public class LeetCode48 {

    public static void main(String[] args) {
        new LeetCode48().rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] is = matrix[i];
            for (int j = 0; j < is.length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println("");
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] reversed = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                reversed[reversed.length - 1 - j] = matrix[i][j];
            }
            matrix[i] = reversed;
        }

        for (int i = 0; i < matrix.length; i++) {
            int[] is = matrix[i];
            for (int j = 0; j < is.length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println("");
        }
    }
}
