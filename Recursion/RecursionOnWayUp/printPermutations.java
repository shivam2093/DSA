package Recursion.RecursionOnWayUp;

public class printPermutations {

      public static void printPermutations1(String str, String asf) {
            if(str.length() == 0){
             System.out.println(asf + " ");
             return;
        }
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            
            printPermutations1(ros, asf + ch);
            
        }
    }
    public static void main(String[] args) {
        printPermutations1("abc", "");
    }
    
}
