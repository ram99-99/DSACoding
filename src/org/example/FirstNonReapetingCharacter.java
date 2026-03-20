package org.example;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReapetingCharacter {
    public static void main(String[] args) {

        String str = "swiss";
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : str.toCharArray()){
            if(freq[c - 'a'] == 1){
                System.out.println("First Non-Repeating Character: " + c);
                return;
            }
        }

        System.out.println("No Non-Repeating Character");



      //  String str = "swiss";
        System.out.println("Str : " + str);
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating
        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                System.out.println("First Non-Repeating Character fhj: " + c);
                return;
            }
        }
    }
}