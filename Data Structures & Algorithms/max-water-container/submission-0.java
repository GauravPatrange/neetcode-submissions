class Solution {
    public int maxArea(int[] heights) {
                int low=0;
        int high=heights.length-1;
        int maxWater = 0;
        while(low<high){
            int len = high-low;
            int min = Math.min(heights[low],heights[high]);

            int water = len*min;
            if(maxWater<water){
                maxWater = water;
            }
            if(heights[low]<=heights[high]){
                low++;
            }else{
                high--;
            }


        }
        return maxWater;
    }
}
