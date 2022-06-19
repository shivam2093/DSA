import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
   int m = nums1.length;
        int n = nums2.length;
       Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums2[j] > nums1[i]){
                i++;
            }else{
                nums1[k++] = nums2[j];
                i++;
                j++;
            }
        }
        
        return Arrays.copyOfRange(nums1 , 0 , k);
        
    }
}