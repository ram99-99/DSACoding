package org.example;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,55,2,3};
        int k = 3;

        int n = a.length;
        int[] rotated = new int[n];

        k = k % n;   // handle k > n

        // Copy elements from k to end
        for(int i = 0; i < n - k; i++){
            rotated[i] = a[i + k];
        }

        // Copy first k elements to end
        for(int i = 0; i < k; i++){
            rotated[n - k + i] = a[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotated));




      /*  int [] a = {1,2,0,0,1,0,3,4,55,2,3};
        int count = 0;
        int [] a1 = new int [a.length];
        int j = 0;
        for(int i = 0; i<=a.length-1;i++){

            if(a[i] != 0){
                a1[j++] =a[i];
            }


        }
        System.out.println(Arrays.toString(a1));

        System.out.println(count);*/




    }

   /* public static int[] rotateRight(int[] arr, int k){
        for(int i = 0; i < k; i++){
            rotated[i] = a[n - k + i];
        }

        for(int i = k; i < n; i++){
            rotated[i] = a[i - k];
        }

    }*/



}