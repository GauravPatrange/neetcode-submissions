class Solution {
    public int search(int[] nums, int target) {
           int pivot=findMin(nums);
        int val1=binarySearch(nums,target,0,pivot);
        int val2=binarySearch(nums,target,pivot,nums.length-1);

        if(val1 == -1 && val2==-1){
            return -1;
        }
        if(val1 != -1){
            return val1;
        }else{
            return val2;
        }
        
    }
    public int binarySearch(int[] nums,int target,int l,int h){
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;
    }
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
                return l;
            }
           
            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                return mid;
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
