package org.example.SlidingWindow;

import java.util.*;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println("targetTwoSum");
        int a[] = {1,2,3,5,6,8,9};
        List<int[]> arrayList = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
       // HashMap<Integer>
        int target = 9;
        for(int i = 0; i<a.length; i++){
            int diff = target - a[i];
            if(map.containsKey(diff)){
                arrayList.add(new int[] {map.get(diff),i});
            }
            map.put(a[i],i);
        }
        for(int[] ar : arrayList) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
