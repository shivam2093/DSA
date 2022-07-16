
import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = 0;
//         int j = 0;
//         Integer[] ans = new Integer[m+n];
//         int k = 0;
//         while(i < m && j < n){
           
//             if(nums1[i] <= nums2[j]){
//                 ans[k] = nums1[i];
//                 k++;
//                 i++;
//             }else if(nums2[j] <= nums1[i]){
//                 ans[k] = nums2[j];
//                 k++;
//                 j++;
//             }
//         }
//         while(i < m){
//             ans[k] = nums1[i];
//             k++;
//             i++;
//         }
//         while(j < n){
//             ans[k] = nums2[j];
//             k++;
//             j++;
//         }
//      //  List<Integer> ans1 = Arrays.asList(ans);
//      // System.out.print(ans1);
        
        int p1 = m - 1;
        int p2 = n-1;
        int i = m+n-1;
        
        while(p2 >=0){
            if(p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }else{
                nums1[i--] = nums2[p2--];
            }
        }
        
    }
}