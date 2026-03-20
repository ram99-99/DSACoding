package org.example.SlidingWindow;

import java.util.Arrays;

public class moveZeorsLast {
    public static void main(String[] args) {
        int [] a = {0,-1,3,0,23,0,9,12};
        int j = 0;
        for(int i = 0; i<a.length;i++){
            if(a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
