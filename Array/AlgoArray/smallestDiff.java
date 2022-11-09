package Array.AlgoArray;
import java.util.*;

public class smallestDiff {
    

    public static int[] smallestDifference(int[] arr1 , int[] arr2){
    
        int indexOne = 0;
        int indexTwo = 0;
        
    
        int smallest = Integer.MAX_VALUE;
        int current = 0;
        
        int[] sp = new int[2];
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
            
        while(indexOne < arr1.length && indexTwo < arr2.length){
            int first = arr1[indexOne];
           int second = arr2[indexTwo];
            if(first < second){
            current  = second - first;
          
            indexOne++;
            }else if(first > second){
                current = first - second;
                indexTwo++;
            }else{
               return new int[] {first , second};
            }
            
            
            if(smallest > current){
                smallest = current;
            
                sp[0] = first;
                sp[1] = second;
            }
            
          
            
        }
    
          return sp;
    }
    public static void main(String[] args) {
        int[] arr1 = {-1,5,10,20,28,3};
        int[] arr2 = {26, 134, 135, 15,17};
        
        int[] ans = smallestDifference(arr1, arr2);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
     
}
