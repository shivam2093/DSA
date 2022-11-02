package Recursion.RecursionBasic;
import java.util.*;
public class powerLogarithmic {


    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.print(power(x, n));
        
        
    }

    public static int power(int x, int n){
        
    if(n == 0){
        
        return 1;
        
    }
    int nmfby2 = power(x , n / 2);
    int xn = nmfby2 * nmfby2;
    if(n % 2 != 0){
        
        xn *= x;
    }
    
    return xn;
        
    }

}

