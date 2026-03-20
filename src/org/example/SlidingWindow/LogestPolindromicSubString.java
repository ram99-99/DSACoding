package org.example.SlidingWindow;

public class LogestPolindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcaba"));
        System.out.println(longestPalindrome1("abcaba"));

    }

    public static String longestPalindrome(String s) {

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if(isPalindrome(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }

        return result;
    }

    private static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static String longestPalindrome1(String s) {

        if(s == null || s.length() < 1)
            return "";

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {

            int len1 = expandFromCenter(s, i, i);
            int len2 = expandFromCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            System.out.println(len);

            if(len > end - start) {
                System.out.println("end: "+end+",start: "+start);
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandFromCenter(String s, int left, int right) {

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }




}
