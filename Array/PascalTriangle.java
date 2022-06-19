import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
      if(numRows == 0){
          return new ArrayList();
      }  
        List<List<Integer>> res = new ArrayList();
        for(int i = 1; i <= numRows; i++){
            
            List<Integer> newRow = new ArrayList();
            for(int j = 0; j < i; j++){
                
                if(j == 0 || j == i - 1){
                        newRow.add(1);
                }else{
                    newRow.add(res.get(i - 2).get(j) + res.get(i - 2).get(j - 1));
                }
                
            }
            res.add(newRow);
        }
      
        return res;
    }
}