package org.example;

public class LargentSecondElement {
    public static void main(String[] args) {

        int [] a = {1,2,0,0,1,0,3,4,55,44,2,3};

        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++){

            if(a[i] > max){
                secondLargest = max;
                max = a[i];
            }
            else if(a[i] > secondLargest && a[i] != max){
                secondLargest = a[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + secondLargest);
    }
}