package org.example.SlidingWindow;

public class MaxSumSubArray {
    public static void main(String[] args) {

        int [] a = {-2,1,-3,4,-1,2,1,-5,4};

        int currentSum = a[0];
        int max = a[0];

        for(Integer n : a){
            System.out.println("currentElement "+ n);
            if(currentSum < 0)
                currentSum = 0;
            currentSum = currentSum + n;
            System.out.println("currentSUem "+ currentSum);
            max = Math.max(currentSum, max);
            System.out.println("maxSum "+ max);
        }

        System.out.println("Maximum SubArray Sum: " + max);
    }
}