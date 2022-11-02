package Recursion.RecursionBasic;

import java.util.*;
public class powerLinear {
   

        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            int n = scn.nextInt();
            System.out.print(power(x,n));
            
        }
    
        public static int power(int x, int n){
            
            if(n == 0){
                return 1;
            }
            
            int multi = power(x , n - 1);
            int ans = x * multi;
            
            return ans;
            
        }
    
    }
    
