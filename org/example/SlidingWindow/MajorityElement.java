package org.example.SlidingWindow;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = {2,2,1,1,2,2};

        int candidate = 0;
        int count = 0;

        // Step 1: Find candidate
        for(int num : arr){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for(int num : arr){
            if(num == candidate){
                count++;
            }
        }

        System.out.println("count"+ count);
        System.out.println("candidate"+ candidate);
        System.out.println("arr.length / 2) : "+arr.length/2);
        if(count > arr.length / 2){
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}