/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge;

/**
 *
 * @author Admin
 */
public class LeetCode3660 {

    public static void main(String[] args) {

    }

    public int recurrsion(int[] nums, int currentIndex, boolean[] visited) {

        int max = nums[currentIndex];
        visited[currentIndex] = true;
        for (int i = currentIndex + 1; i < nums.length; i++) {
            if (nums[currentIndex] > nums[i] && !visited[i]) {

                int res = recurrsion(nums, i, visited);

                max = Math.max(max, res);
            }

        }

        for (int i = currentIndex - 1; i >= 0; i--) {

            if (nums[i] > nums[currentIndex] && !visited[i]) {

                int res = recurrsion(nums, i, visited);

                max = Math.max(max, res);
            }
        }

        return max;
    }

    public int[] maxValue(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean[] visited = new boolean[nums.length];
            arr[i] = recurrsion(nums, i, visited);
        }
        return arr;
    }

}
