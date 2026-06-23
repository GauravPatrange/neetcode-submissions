class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int maxVal = 0;

        while(right < prices.length){
            if(prices[left] < prices[right] ){
                maxVal = Math.max(maxVal, prices[right] - prices[left]);
            }else{
                left = right;
            }
            right++;
        }
        return maxVal;
        
    }
}
