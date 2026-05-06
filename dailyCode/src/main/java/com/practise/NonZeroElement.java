/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class NonZeroElement {

    public void moveNoneZeroEle(int arr[]) {

        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        for (int i = pos; i < arr.length; i++) {
            arr[pos++] = 0;

        }
    }
}
