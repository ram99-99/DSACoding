package org.example.SlidingWindow;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5};  // Missing 4
        int n = 5;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : arr){
            actualSum += num;
        }
        System.out.println(Arrays.stream(arr).count());

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}