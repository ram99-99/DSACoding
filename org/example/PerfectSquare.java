package org.example;

public class PerfectSquare {
    public static void main(String[] args) {

        int num = 16;


        //int num = 16;

        int root = (int) Math.sqrt(num);

        if(root * root == num){
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }

        if(isPerfectSquare(num)){
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }
    }

    public static boolean isPerfectSquare(int num){

        if(num < 0) return false;

        int l = 0;
        int r = num;

        while(l <= r){

            long mid = l + (r - l) / 2;
            long square = mid * mid;

            if(square == num){
                return true;
            }
            else if(square < num){
                l = (int)mid + 1;
            }
            else{
                r = (int)mid - 1;
            }
        }

        return false;
    }
}