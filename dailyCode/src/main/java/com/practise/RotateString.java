/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class RotateString {

    public static void main(String[] args) {
        new RotateString().rotateString("abcd", "cdab");
    }

    public boolean rotateString(String s, String goal) {
        int rotationLimit = s.length();

        for (int i = 0; i < rotationLimit; i++) {
            String val = s.substring(i, s.length()) + s.substring(0, i);
            if (goal.equalsIgnoreCase(val)) {
                return true;
            }
        }

        return false;
    }
}
