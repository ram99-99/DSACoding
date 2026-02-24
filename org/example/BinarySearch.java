package org.example;

class BinarySearch {
    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,8,9};

        int l = 0;
        int r = a.length - 1;   // ✅ FIXED

        int target = 2;

        while(l <= r){

            int mid = l + (r - l) / 2;   // safer way
            System.out.println("Mid: " + mid);

            if(a[mid] == target){
                System.out.println("Position: " + mid);
                return;
            }
            else if(a[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
}