class Solution {
    public int minEatingSpeed(int[] piles, int h) {
                int maxPile = Integer.MIN_VALUE;
        for(int val : piles){
            maxPile = Math.max(val,maxPile);
        }

        for(int i=1;i<=maxPile;i++){
            long sum = 0;
            for(int j=0;j<piles.length;j++){
                sum += Math.ceil((double)piles[j]/i);
                
            }
            if(sum <= h){
                return i;
            }
        }
        return -1;
    }
}
