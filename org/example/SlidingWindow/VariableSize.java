package org.example.SlidingWindow;

public class VariableSize {
    public static void main(String[] args) {

  /*  Variable Size Sliding Window.
      You are given an array and You should
      Find the maximum length of the
        subarray which has atmost k ones

        Example:
    [0,1,3,1,1,6,7,1,0,1] k =2
        Ans: 5*/

        int[] arr = {0,1,3,1,1,6,7,1,0,1};
        int n = arr.length;
        int temp =0;
        int l = 0;
        int k = 2;
         int ans = 0;
        for(int r=0;r<arr.length;r++){
            if(arr[r] == 1){
                temp+=arr[r];
            }
            while(temp > k){
              if(arr[l] == 1){
                  temp-= arr[l];
              }
              l++;

            }
            ans = Math.max(ans,r-l+1);

        }
        System.out.println(ans);



    }

}
