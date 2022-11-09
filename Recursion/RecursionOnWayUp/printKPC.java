package Recursion.RecursionOnWayUp;
import java.io.*;
import java.util.*;



public class printKPC {
        public static void main(String[] args) throws Exception {
            
            try (Scanner scn = new Scanner(System.in)) {
                String str = scn.nextLine();
                
                printKPC1( str, "");
            }
    
        }
        
        static String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
        public static void printKPC1(String str, String asf) {
            //Base case
            if(str.length() == 0){
             System.out.println(asf);
             return;
            }
            
            
            char ch = str.charAt(0);
            String rr = str.substring(1);
            
            // the number pressed at 0th position get the string and store to the String of 'code'--> if number pressed 479 then it takes 4 and store it value 'jkl' into String 'code'
            String code = arr[ch - '0'];  
            
            // this loop runs on 'jkl' and every first char add to the result
            for(int i = 0; i < code.length(); i++){
            
            char c = code.charAt(i);
            printKPC1(rr,asf + c);
            
            }
        
            
            
        }
    
    
}
