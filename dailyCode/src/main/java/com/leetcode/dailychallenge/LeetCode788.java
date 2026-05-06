/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge;

/**
 *
 * @author Admin
 */
public class LeetCode788 {

    public static void main(String[] args) {

        LeetCode788 l = new LeetCode788();

        System.out.println(":::::::: " + l.rotatedDigits(10));

    }

    public int rotatedDigits(int n) {

        int validCount = 0;

        for (int i = 1; i <= n; i++) {
            boolean isValid = true;
            boolean isChanged = false;
            int temp = i;
            while (temp > 0) {
                int lastDigit = temp % 10;
                if (lastDigit == 3 || lastDigit == 4 || lastDigit == 7) {
                    isValid = false;
                    break;
                } else if (lastDigit == 2 || lastDigit == 5 || lastDigit == 6 || lastDigit == 9) {
                    isChanged = true;
                }
                temp = temp / 10;
            }
            if (isValid && isChanged) {
                validCount++;
            }
        }
        return validCount;

    }
}
