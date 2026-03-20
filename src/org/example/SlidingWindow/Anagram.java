package org.example.SlidingWindow;

public class Anagram {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for(char c : s.toCharArray()) {
            count[c - 'a']++;
           // System.out.println(count[c - 'a']++);

        }


        for(char c : t.toCharArray()){
            count[c - 'a']--;
           // System.out.println(count[c - 'a']++);
        }

        for(int num : count) {
            System.out.println(num);
            if (num != 0)
                return false;
        }

        return true;
    }
}
