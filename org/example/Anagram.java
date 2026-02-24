package org.example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        int count[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0){
                System.out.println("Not Anagram");
                return false;
            }
        }
        return true;
    }


}