/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class NegativeNumSlide {

    public static void main(String[] args) {

        NegativeNumSlide ne = new NegativeNumSlide();

        ne.negativeNumSlide(new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3);
    }

    public void negativeNumSlide(int arr[], int k) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (k + i <= arr.length) {
                for (int j = i; j < k + i; j++) {
                    System.out.print(arr[j] + ", ");
                    list.add(Integer.min(arr[j], 0));
                    if (arr[j] < 0) {
                        list.add(arr[j]);
                        break;
                    }
                }
            }
            System.out.println("");
        }
        System.out.println(list);
    }

    public void approach2(int arr[], int k) {

        Queue<Integer> q = new LinkedList<>();

        int i = 0, j = 0;
        int len = arr.length;

        while (j < len) {
            if (arr[j] < 0) {
                q.add(arr[j]);
            }
            if ((j - i + 1) == k) {

            }

        }

    }

    public void maxAvg(int arr[], int k) {
        int i = 0, j = 0;
        int len = arr.length;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while (j < len) {

            sum += arr[j];

            while (sum >= k) {
                minLen = Math.min(minLen, (j - i + 1));
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
    }

    public void longestSubString(String str) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;
        int len = str.length();
        int maxLen = 0;
        while (j < len) {
            char ch = str.charAt(j);
            while (set.contains(ch)) {
                set.remove(str.charAt(i));
                i++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;

        }
    }
//aaba

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int len = s.length(), maxFreq = 0, maxLen = 0;
        while (j < len) {
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            int windowSize = (j - i) + 1;

            if (windowSize - maxFreq > k) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }
            maxLen = Math.max(maxLen, (j - i + 1));
            j++;

        }
        return maxLen;

    }
}
