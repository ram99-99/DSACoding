package org.example.SlidingWindow;
public class BestTimeToSell {
   // [7,1,5,3,6,4]
    public static void main(String[] args) {
        int a[] = { 7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : a) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        System.out.print(profit);


    }

}
