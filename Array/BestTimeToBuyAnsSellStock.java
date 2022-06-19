class Solution {
    public int maxProfit(int[] prices) {      
//  int min = prices[0];
//  int getIndex = 0;  
        
// for(int i = 0; i < prices.length; i++){
//     if(prices[i] < min){
//         min = prices[i];
//     }
// }    
// for(int j = 0; j < prices.length; j++){
//     if(prices[j] == min){
//         getIndex += j;
//     }
// }
//         if(getIndex == prices.length - 1){
//             return 0;
//         }      
//     int max = 0;    
// for(int k = getIndex; k < prices.length; k++){
   
//     if(prices[k] > max){
//        max = prices[k];
//    }
// }
    
//       return max - prices[getIndex]; 
        
// }
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
}
}