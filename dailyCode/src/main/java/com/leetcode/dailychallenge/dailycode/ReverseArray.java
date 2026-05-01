/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge.dailycode;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int left = 0;
        int right = arr.length - 1;
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        for (int i : arr) {
            System.out.print(i +" ");
        }
        System.out.println("");

        //sol1
        int reverseArr[] = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[count++] = arr[i];

        }

        for (int i : reverseArr) {
            System.out.print(i + " ");
        }
    }

}
