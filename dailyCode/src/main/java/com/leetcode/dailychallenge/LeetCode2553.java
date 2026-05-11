/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leetcode.dailychallenge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LeetCode2553 {

    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            for (String str : String.valueOf(num).split("")) {
                list.add(Integer.valueOf(str));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();

    }

}
