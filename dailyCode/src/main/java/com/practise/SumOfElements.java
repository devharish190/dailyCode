/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class SumOfElements {

    public static void main(String[] args) {

    }

    public int[] sumofElements(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] sumofElementsSoln2(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int requires = target - arr[i];

            if (map.containsKey(requires)) {
                return new int[]{
                    map.get(requires),
                    i
                };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};

    }

}
