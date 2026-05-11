/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class SlidingWindow {

    public static void main(String[] args) {
        slidingWindowPractise(new int[]{2, 1, 5, 1, 3, 2}, 3);
    }

    public static int slidingWindowPractise(int[] arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
