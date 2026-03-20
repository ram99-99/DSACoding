package org.example.SlidingWindow;

import java.util.Arrays;

public class productOfSumExeptSelf {
    public static void main(String[] args) {
        int num [] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(num)));
        System.out.println(Arrays.toString(productExceptSelf1(num)));
        System.out.println(Arrays.toString(productExceptSelf2(num)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i < n; i++){

            int product = 1;

            for(int j = 0; j < n; j++){

                if(i != j){
                    product *= nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    public static int[] productExceptSelf1(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int totalProduct = 1;

        for(int num : nums){
            totalProduct *= num;
        }

        for(int i = 0; i < n; i++){
            result[i] = totalProduct / nums[i];
        }

        return result;
    }

    public static int[] productExceptSelf2(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;

        for(int i=0;i<n;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;

        for(int i=n-1;i>=0;i--){
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
