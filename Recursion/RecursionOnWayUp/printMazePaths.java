package Recursion.RecursionOnWayUp;

public class printMazePaths {
    
  	    public static void printMazePaths1(int sr, int sc, int dr, int dc, String psf) {
	     
	    if(sr == dr && sc == dc){
	        System.out.println(psf + "");
	        return;
	    }
	     
	    if(sr > dr || sc > dc ){
	        return;
	    }
	     
	     
	       printMazePaths1(sr, sc + 1, dr, dc, psf + "h");
	       printMazePaths1(sr + 1, sc, dr, dc, psf + "v");
	        
	        
	   }
       public static void main(String[] args) {
        printMazePaths1(0, 0, 3, 3, "");
       }

}
