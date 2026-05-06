/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class Palindrome {

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));

    }

    public boolean isPalindrome(int n) {

        int count = 0;
        int temp = n;

        while (temp > 0) {
            int lastDigit = temp % 10;
            
            count += (lastDigit * 10);
            System.out.println("" + lastDigit + " :: " + temp + " ::: " + count);
            temp = temp / 10;
        }

        return temp == n;
    }

}
