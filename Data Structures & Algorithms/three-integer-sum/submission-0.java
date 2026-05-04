class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int low = i+1;
            int high = nums.length-1;

            while(low<high){
                int curSum = nums[low] + nums[high];
                if(curSum + val < 0){
                    low++;
                }else if(curSum + val > 0){
                    high--;
                }else{
                    list.add(Arrays.asList(val, nums[low], nums[high]));
                    low++;
                    while(nums[low] == nums[low-1] && low<high){
                        low++;
                    }
                }
            }

        }

        return list;
    }
}
