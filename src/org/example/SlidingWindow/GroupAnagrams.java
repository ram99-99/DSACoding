package org.example.SlidingWindow;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String [] array = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(array));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            System.out.println("keys "+key);




            if(!map.containsKey(key)) {
                System.out.println("inindise");
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
