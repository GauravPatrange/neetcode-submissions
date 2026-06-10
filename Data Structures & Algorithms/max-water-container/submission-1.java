class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;

        int maxArea = 0;
        while(i<j){
            int len = j-i;
            if(heights[i]<=heights[j]) {
                maxArea=Math.max(maxArea,heights[i]*len);
                i++;
            }else{
                maxArea=Math.max(maxArea,heights[j]*len);
                j--;
            }

        }
        return maxArea;
        
        
    }
}
