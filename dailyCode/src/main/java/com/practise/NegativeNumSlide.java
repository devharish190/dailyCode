/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Admin
 */
public class NegativeNumSlide {

    public static void mainN(String[] args) {

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

    public boolean palindromeCheck(String str) {

        int left = 0;
        int right = str.length();

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String reverse(String str) {
        int left = 0;
        char arr[] = str.toCharArray();
        int right = arr.length - 1;

        while (left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);

    }

    public boolean isPalindromeCheck(String strVal) {

        String str = strVal.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = str.charAt(left);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            char rightChar = str.charAt(right);
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
        int dup[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                dup[count++] = arr[i];
            }

        }

    }

    public boolean isAnagram(String s, String t) {
        char[] str = s.toCharArray();
        char[] tstr = t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(tstr);

        return Arrays.equals(str, tstr);
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int integer : nums) {
            if (set.contains(integer)) {
                return true;
            }
            set.add(integer);
        }
        return false;
    }

//    [1,3,5,7,9,11],  target=9
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    public boolean isBadVersion(int version) {
        return version >= 4;
    }

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (character.equals('{')
                    || character.equals('[') || character.equals('(')) {

                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == '(' && character == ')') {
                    stack.pop();
                } else if (stack.peek() == '[' && character == ']') {
                    stack.pop();
                } else if (stack.peek() == '{' && character == '}') {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.empty();
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public int countNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean containsValue(ListNode head, int target) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.val == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public ListNode insertAtEnd(ListNode head, int value) {

        if (head == null) {
            return new ListNode(value);
        }
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new ListNode(value);
        return head;
    }

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;

    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String[] args) {
//        System.out.println("val === " + new NegativeNumSlide().isPalindromeCheck("A man a plan a canal Panama"));
//        System.out.println("val === " + new NegativeNumSlide().binarySearch(new int[]{1, 3, 5, 7, 9, 11}, 9));
        NegativeNumSlide nn = new NegativeNumSlide();
//        System.out.println(nn.firstBadVersion(8));
        System.out.println(nn.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

}
