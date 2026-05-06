/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class BuyAndSell {

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};

        int maxProfit = 0;

        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minVal = Math.min(arr[i], minVal);
            int profit = arr[i] - minVal;
            maxProfit = Math.max(profit, maxProfit);
        }
        System.out.println(maxProfit);

    }
}
