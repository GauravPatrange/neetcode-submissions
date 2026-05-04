class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int val : nums){
            set.add(val);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
    
            if(!set.contains(nums[i]-1)){
                int len=1;
                while(set.contains(nums[i]+len)){
                    len++;
                }
                
                if(max<len){
                    max=len;
                }
            }

        }

        return max;
    }
}
