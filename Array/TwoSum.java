import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       
        
       // int first = 0;
       //  int last = nums.length - 1;
        
//         while(first < last){
//             int val = nums[first] + nums[last];
            
            
//             if(val == target){
//                    return new int[] {first,last};
//             }else if(val > target){
//                 last--;
//             }else if(val < target){
//                 first++;
//             }
//         }
        
//         return new int[0];
        
        Set<Integer> h = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            int currSum = target - nums[i];
            
            if(h.contains(currSum)){
                return new int[] {linear(nums , currSum) , i};
            }else{
                h.add(nums[i]);
            }
        }
        
        
        return new int[0];
        
    }
    
    public int linear(int[] arr , int t){
        if(arr == null){
            return -1;
        }
        
        int f= 0;
        int l = arr.length;
        
        while(f < l){
            if(arr[f] == t){
                return f;
            }else{
                f++;
            }
        }
        return 0;
    }
}