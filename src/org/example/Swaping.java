package org.example;

public class Swaping {




    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("a: value : "+a+" b value : "+b);
        //using Third Variable
      /*   int temp;
         temp = a;
         a = b;
         b = temp;*/

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: value : " + a + " b value : " + b);
    }
}
