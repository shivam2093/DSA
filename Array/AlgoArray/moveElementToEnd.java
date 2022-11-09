package Array.AlgoArray;

import java.util.*;

//Move the given integer to last
public class moveElementToEnd {
    

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
 
        int left = 0; 
        int right = array.size() - 1;
        
        while(left < right){
            
            while(left < right && array.get(right) == toMove){
                right--;
            }
            
            if(array.get(left) == toMove){
                
                int temp = array.get(left);
                
                array.set(left , array.get(right));
                array.set(right , temp);
                
            }
            left++;
            
        }
        
        return array;
        
    }

    public static void main(String[] args) {
    List<Integer> arr3 = new ArrayList<>();
    arr3.add(2);
    arr3.add(1);
    arr3.add(2);
    arr3.add(2);
    arr3.add(2);
    arr3.add(3);
    arr3.add(4);
    arr3.add(2);

    List<Integer> rr1 = moveElementToEnd(arr3, 2);
    for(int i = 0; i < rr1.size(); i++){
        System.out.print(rr1.get(i) + " ");
    }
    }

}
