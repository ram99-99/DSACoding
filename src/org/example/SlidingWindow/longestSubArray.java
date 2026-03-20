package org.example.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class longestSubArray {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = Integer.MIN_VALUE;
        for(int r =0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-left+1);

        }
        System.out.println(max);

        System.out.println(longestSubstring(s));
    }

    public static String longestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if(right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
