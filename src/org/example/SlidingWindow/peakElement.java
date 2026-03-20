package org.example.SlidingWindow;

public class peakElement {
    public static void main(String[] args) {
        int [] a = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(a));
        System.out.println(findPeakElement1(a));

    }

    public static  int findPeakElement(int[] nums) {

        for(int i = 0; i < nums.length; i++) {

            boolean left = (i == 0) || nums[i] > nums[i - 1];
            boolean right = (i == nums.length - 1) || nums[i] > nums[i + 1];

            if(left && right) {
                return i;
            }
        }

        return -1;
    }

    public static int findPeakElement1(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
