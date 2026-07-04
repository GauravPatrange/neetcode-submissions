class Solution {
    public int search(int[] nums, int target) {
        int minIndex = findMinIndex(nums);
        
        int val1 = binarySearch(nums, 0, minIndex-1, target);
        int val2 = binarySearch(nums,minIndex, nums.length-1, target);

        if(val1 != -1){
            return val1;
        }else if(val2 != -1){
            return val2;
        }else {
            return -1;
        }
    }

    private int binarySearch(int[] nums,int start, int end, int target){
        while(start<= end){
            int mid = start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target > nums[mid]){
                start = mid +1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    private int findMinIndex(int[] nums){
        int start = 0;
        int end = nums.length-1;

        if(nums[start]<nums[end]){
            return nums[start];
        }

        while(start <=end){

            int mid = start+(end-start)/2;
            int prev = (mid == 0) ? mid : mid - 1;
            int next = (mid == nums.length - 1) ? mid : mid + 1;

             if(nums[start]<nums[end]){
                return start;
            }

            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev]){
                return mid;
            }

            if(nums[start]<= nums[mid]){
                start = mid+1;
            }else if(nums[mid] <= nums[end]){
                end = mid-1;
            }
        }
        return -1;

    }
}
