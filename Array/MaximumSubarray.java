class Solution {
    public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < nums.length; i++){
//                 // if(nums.length == 1){
//                 //     return nums[i];
//                 // }
//             int curr = 0;
//             for(int j = i; j < nums.length; j++){
//                  curr += nums[j];
                
//                 if(curr > max){
//                     max = curr;
//                 }
//             // max = Math.max(curr, max);
//             }
//             // arr[i] = max;  
//         }
//         // int maximum = 0;
//         // for(int i = 0; i < arr.length; i++){
//         //     if(arr[i] > maximum){
//         //         maximum = arr[i];
//         //     }
//         // }  
        int curr = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            int num = nums[i];
            curr = Math.max(num , curr + num);
            max = Math.max(curr , max);
        }
        return max;
    }
}