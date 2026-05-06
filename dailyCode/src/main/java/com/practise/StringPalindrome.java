/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class StringPalindrome {

    public boolean isPalindrome(String s) {

        String str = s.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char leftChar = str.charAt(left);

            char rightChar = str.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
