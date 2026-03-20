package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int count = 0;
        int temp = num;

        // Count digits
        while(temp > 0){
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        // Calculate sum of digits^count
        while(temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        if(sum == original){
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}