package Recursion.RecursionBasic;


import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    System.out.print(factorial1(n));
        
        
    }

    public static int factorial1(int n){
        
        if(n == 0){
            return 1;
        }
       
       int nmf = factorial1(n - 1);
       int nf = nmf * n;
       
       return nf;
       
       
    }

}
