class Solution {
    public int maxProfit(int[] prices) {
        int[] maxR = new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            if(i==prices.length-1){
                maxR[i]=prices[i];
            }else{
                maxR[i]=Math.max(prices[i],maxR[i+1]);
            }
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int mx = maxR[i]-prices[i];
            if(max <= mx){
                max=mx;
            }
        }
        return max;
        
    }
}
