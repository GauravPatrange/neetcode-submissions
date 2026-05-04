class Solution {
    public int trap(int[] height) {
        int[] maxL = new int[height.length];
        for(int i=0;i<height.length;i++){
            if(i==0){
                maxL[i]=height[i];
            }else{
                maxL[i]=Math.max(maxL[i-1],height[i]);
            }
            
        }

        int[] maxR = new int[height.length];
        for(int i=height.length-1;i>=0;i--){
            if(i==height.length-1){
                maxR[i]=height[i];
            }else{
                maxR[i]=Math.max(maxR[i+1],height[i]);
            }
        }

        int sum=0;
        for(int i=0;i<height.length;i++){
            int mins = Math.min(maxL[i],maxR[i]);
            sum+=mins-height[i];
        }
        return sum;
        
    }
}
