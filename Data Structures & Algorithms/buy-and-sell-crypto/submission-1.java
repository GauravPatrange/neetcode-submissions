class Solution {
    public int maxProfit(int[] prices) {
        
        int[] arr = new int[prices.length];

        for(int i=prices.length-1;i>=0;i--){
            if(i == prices.length-1){
                arr[i] = prices[i];

            }else{
                arr[i] = Math.max(prices[i],arr[i+1]);
            }
            
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            max = Math.max(max, arr[i]-prices[i]);
        }
        return max;

    }
}
