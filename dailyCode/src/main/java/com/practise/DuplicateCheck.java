/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Admin
 */
public class DuplicateCheck {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);

        }
        return false;

    }

}
