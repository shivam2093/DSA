package Recursion.RecursionOnWayUp;

public class printStairPaths {
 
    
      public static void printStairPaths1(int n, String path) {
        
      if(n == 0){
          System.out.print(path + " ");
            return;
      }
      
      if(n < 0){
          return;
      }
      
      
      printStairPaths1(n - 1, path + "1");
      printStairPaths1(n - 2, path + "2");
      printStairPaths1(n - 3, path + "3");    
          
      }
      public static void main(String[] args) {
        printStairPaths1(3, "");
      }
}
