class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        if(nums[l]<nums[h]){
            return nums[l];
        }
        while(l<=h){
 
            int mid=l+(h-l)/2;
            int next = (mid+1)%nums.length;
            int prev = (mid+nums.length-1)%nums.length; 
            if(nums[l]<=nums[h]){
                return nums[l];
            }
           
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                return nums[mid];
            }
            if(nums[l]<=nums[mid]){
                l=mid+1;
            }else if (nums[mid] <=nums[h]){
                h=mid-1;
            }
            
        }
        return -1;
    }
}
