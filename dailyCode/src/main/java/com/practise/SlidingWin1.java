/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class SlidingWin1 {

    public static void main(String[] args) {
        int b = new SlidingWin1().SlidingWindowPractise(new int[]{2, 1, 5, 1, 3, 2}, 3);

        System.out.println(b);
    }

    public int SlidingWindowPractise(int arr[], int target) {

        int sum = 0;
        for (int i = 0; i < target; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = target; i < arr.length; i++) {
            sum = (sum - arr[i - target]) + arr[i];
            maxSum = Math.max(maxSum, sum);

        }

        return maxSum;
    }
}
