package Recursion.RecursionInArrays;

import java.io.*;

//return the array and fill all index of the given integer in an array

public class allIndices{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices1(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices1(int[] arr, int x, int idx, int fsf) {
        // write ur code here
         if(idx == arr.length){
            int[] ans = new int[fsf];
            return ans;
            
        }
        
        
        if(arr[idx] == x){
          fsf++;
        }
        
        int[] rr = allIndices1(arr, x, idx + 1, fsf);
        
        if(arr[idx] == x){
            rr[fsf - 1] = idx;
        }
        
        return rr;
    }
}