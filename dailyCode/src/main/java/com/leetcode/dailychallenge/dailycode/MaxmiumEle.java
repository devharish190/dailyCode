/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge.dailycode;

/**
 *
 * @author Admin
 */
public class MaxmiumEle {

    public static void main(String[] args) {

        int arr[] = {3, 7, 2, 9, 4};

        MaxmiumEle maxmiumEle = new MaxmiumEle();
        maxmiumEle.soln1(arr);
        maxmiumEle.soln2(arr);
    }

    public void soln2(int[] arr) {
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                val = Math.max(val, Math.max(arr[i], arr[j]));

            }
        }
        System.out.println("sol2 "+val);
    }

    public void soln1(int[] arr) {
        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int j = arr[i];
            val = Math.max(val, j);
        }

        System.out.println(val);
    }
}
