package org.example.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fixedsize {

  /*  Highest sum of subarray of length 3 in below array.
[5,9,1,8,7]*/

    public static void main(String[] args) {

        int[] n = { 5,9,1,8,7};
        int len = n.length;
       // int k = 3;
     //   int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= len-3; i++) {
           int sum = 0;
            for (int j = i; j < i+3; j++) {
                sum+=n[j];
            }
            ans = Math.max(sum,ans);
        }
        System.out.println("BruteForce Solution"+ans);
        System.out.println(findMax(n));
        System.out.println(Arrays.toString(findMinMax(n, 3)));
        String name = "rambabu";
        System.out.println("rambabu: "+countUniqueSubstrings(name,3));

    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        int l = 0;
        for (int i = 0; i <arr.length; i++) {
            temp += arr[i];
            if(i-l == 3){
                temp -= arr[l];
                l++;
            }



          //  max = Math.min(temp,max);
            max = Math.max(temp,max);

        }
        return max;
    }

    public static int[] findMinMax(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            if (right - left + 1 == k) {   // window size reached
                minSum = Math.min(minSum, windowSum);
                maxSum = Math.max(maxSum, windowSum);

                windowSum -= arr[left];
                left++;
            }
        }

        return new int[]{minSum, maxSum};
    }

    public static int countUniqueSubstrings(String s, int k) {

        if (s == null || s.length() < k) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int count = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (r - l + 1 == k) {

                // check if all characters are unique
                if (map.size() == k) {
                    count++;
                }

                // shrink window
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }
        }
        return count;
    }



}
