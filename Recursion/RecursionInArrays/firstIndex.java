package Recursion.RecursionInArrays;

import java.util.*;

//find first Index of the given integer
public class firstIndex {



    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        System.out.println(firstIndex1(arr, 0, x));
    }

    public static int firstIndex1(int[] arr, int idx, int x){
        
        if(idx == arr.length){
            return -1;
        }
        
        if(arr[idx] == x){
            return idx;
            
        }
        else{
            return firstIndex1(arr, idx + 1, x);
        }
       
    }

}

