class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Integer.MIN_VALUE;
        for(int val : piles){
            maxPile = Math.max(val,maxPile);
        }
        int low=1;
        int high=maxPile;
        int res=high;
        while(low<=high){

            int mid=low+(high-low)/2;

            long totalTime=0;
            for(int p : piles){
                totalTime += Math.ceil((double)p / mid);
            }

            if(totalTime <= h){
                res = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return res;
    }
}
