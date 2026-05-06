/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge;

/**
 *
 * @author Admin
 */
public class LeetCode1861 {

    public static void main(String[] args) {

//        new LeetCode1861().rotateTheBox(new char[][]{{'#','.','#'}});
        new LeetCode1861().rotateTheBox(new char[][]{{'#', '.', '*'}});

//        new LeetCode1861().rotateSIngleTheBox(new char[]{'#', '.', '#', '.', '*'});
//        new LeetCode1861().rotateSIngleTheBox(new char[]{'#', '#', '*', '.', '#'});
    }

    public char[][] rotateTheBox(char[][] boxGrid) {

        char[][] chararr = new char[boxGrid[0].length][boxGrid.length];

        for (int i = 0; i < boxGrid.length; i++) {
            char[] cs = boxGrid[i];
            rotateSIngleTheBox(cs);
            for (int j = 0; j < cs.length; j++) {
                chararr[j][boxGrid.length - 1 - i] = boxGrid[i][j];
            }

        }

        for (char[] cs : chararr) {
            for (char c : cs) {
                System.out.print(c);
            }
            System.out.println("");
        }

        return chararr;
    }

    public char[] rotateSIngleTheBox(char[] boxGrid) {
//        char[] movedBoxed = new char[boxGrid.length];
        int pointer = boxGrid.length - 1;
        for (int i = boxGrid.length - 1; i >= 0; i--) {
            char c = boxGrid[i];
            switch (c) {
                case '*':
                    pointer = i - 1;
                    break;
                case '.':
                    break;
                case '#':
                    boxGrid[i] = '.';
                    boxGrid[pointer--] = '#';
                    break;
            }

        }

        return boxGrid;
    }

}
