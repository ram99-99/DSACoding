package org.example.SlidingWindow;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,9,4,5,6};
        int[] b = {1,2,9,12,13};
        int i = 0, j = 0, k = 0;
        int[] merged = new int [a.length + b.length];
        while( i < a.length && j < b.length){
            if(a[i] < b[j]){
                merged[k++] = a[i++];
            }else{
                merged[k++] = b[j++];
            }
        }
        while(i < a.length){
            merged[k++] = a[i++];
        }
        while(j < b.length){
            merged[k++] = b[j++];
        }
        System.out.println(Arrays.toString(merged));
    }
}
