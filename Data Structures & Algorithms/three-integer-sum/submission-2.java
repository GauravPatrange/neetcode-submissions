class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]> 0){
                break;
            }
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int target = nums[i];

            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                if(target+nums[start]+nums[end]>0){
                    end--;
                }else if(target+nums[start]+nums[end]<0){
                    start++;
                }else{
                    list.add(Arrays.asList(target,nums[start],nums[end]));
                    start++;
                    while(nums[start] == nums[start-1] && start<end){
                        start++;
                    }
                }
            }
        }
        return list;
    }

}
