package Recursion.RecursionInArrays;

import java.util.*;
public class maxOfArray {

    
        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = scn.nextInt();
            }
            
            System.out.print(maxOfArray1(arr , 0));
            
            
        }
    
        public static int maxOfArray1(int[] arr, int idx){
            
            if(idx == arr.length-1){
                return arr[idx];
            }
            
            int fn =  maxOfArray1(arr, idx + 1);
            int max = Math.max(fn, arr[idx]);
            
            return max;
        
        
        }
    
    
}
