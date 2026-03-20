package org.example;

public class GCD {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int gcd = 1;

        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }

        System.out.println("GCD: " + gcd);


      /*  int a = 12;
        int b = 18;
*/
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD: " + a);
        System.out.println("GCD: " + gcd(12,18));

    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}