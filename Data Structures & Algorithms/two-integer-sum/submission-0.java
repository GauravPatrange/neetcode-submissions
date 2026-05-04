class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int val1 = -1;
        int val2 = -1;
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(target-nums[i])){
                if(i != map.get(target-nums[i])){
                    val1=i;
                    val2=map.get(target-nums[i]);
                }

                break;
            }
            map.put(nums[i],i);
        }

        return new int[]{val2, val1};
    }
}
