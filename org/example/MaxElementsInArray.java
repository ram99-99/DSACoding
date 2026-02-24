package org.example;

public class MaxElementsInArray {
    public static void main(String[] args) {

        int [] a = { 1,2,3,45,50,89,0,1001};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<a.length;i++){
          //  System.out.println(a[i]);
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
            if(a[i]%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println("eventCount "+ evenCount);
      System.out.println("oddCount "+ oddCount);
    }
}
