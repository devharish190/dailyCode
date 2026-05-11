/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

/**
 *
 * @author Admin
 */
public class SortedArray {

    public static void main(String[] args) {
        SortedArray sor = new SortedArray();
//        sor.removeVal(new int[]{3, 2, 2, 3}, 3);
        sor.moveZeros(new int[]{0, 1, 0, 3, 12});
//        sor.replaceDuplicates(new int[]{1, 1, 2, 3, 3});

//        int[] res = sor.getValue(new int[]{1, 2, 3, 4, 6}, 6);
//
//        for (int re : res) {
//            System.out.print(re);
//        }
//        System.out.println("");
    }

    public boolean checkPalindrome(String s) {

        int left = 0;
        String str = s.toLowerCase();
        int right = str.length() - 1;

        while (left < right) {

            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;

        }
        return true;
    }

    public void moveZeros(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");

        }
        System.out.println("");
    }

    //3,2,2,3 target=3
    public void removeVal(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[count++] = arr[i];
            } else {
                arr[i] = 0;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("");

    }

    public void replaceDuplicates(int arr[]) {
        int slow = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[slow]) {
                slow++;
                arr[slow] = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("");
    }

    public int[] getValue(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
