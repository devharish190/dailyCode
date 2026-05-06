/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class StockBuySell {

    public int buyNSellStocks(int arr[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {

            minPrice = Math.min(minPrice, arr[i]);

            int profit = arr[i] - minPrice;

            maxProfit = Math.max(profit, maxProfit);

        }
        return maxProfit;

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int subStringLen = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                subStringLen--;

            } else {
                set.add(ch);
                subStringLen++;
            }

        }
        return subStringLen;

    }

}
