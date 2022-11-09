package Recursion.RecursionOnWayUp;

public class printMazePathsWithJumps {
    	     public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr == dr && sc == dc){
            System.out.println(psf + "");
            return;
        }
    
	            
	            
	      for(int jump = 1; jump <= dc - sc; jump++){
	          printMazePaths(sr, sc + jump, dr, dc, psf +"h"+jump);
	      }
	      for(int jump = 1; jump <= dr - sr; jump++){
	          printMazePaths(sr + jump, sc, dr, dc, psf +"v"+jump);
	      }
	      for(int jump = 1; jump <= dc - sc && jump <= dr - sr; jump++){
	          printMazePaths(sr + jump, sc + jump, dr , dc , psf +"d"+ jump);
	      }
	       
	       
	          
	     }
         public static void main(String[] args) {
            printMazePaths(0, 0, 3, 3, "");
         }
    
}
