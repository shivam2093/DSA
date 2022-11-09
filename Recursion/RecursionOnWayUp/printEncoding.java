package Recursion.RecursionOnWayUp;

public class printEncoding {
    public static void printEncodings1(String str, String asf) {
   
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }      
     
            
            String ch = str.substring(0,1);
            String ros = str.substring(1);
        
            printEncodings1(ros , asf + (char)(Integer.parseInt(ch) - 1 + 'a'));
            
            if(str.length() >= 2)
         {
            if(Integer.parseInt(ch) <= 26 ){
            String ch1 = str.substring(0,2);
            String ros1 = str.substring(2);  
             printEncodings1(ros1, asf + (char)(Integer.parseInt(ch1) - 1 + 'a'));
            }
        }        
    }
    public static void main(String[] args) {
        printEncodings1("993", "");
    }    
}
