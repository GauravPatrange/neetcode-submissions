class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int val : nums){
            set.add(val);
        }

        int i=0;
        int max = 0;
        
        while(i<nums.length){
            if(!set.contains(nums[i]-1)){
                
                int val =  nums[i];
                int count = 1;
                while(set.contains(val+1)){
                    count++;
                    val=val+1;
                }
                max=Math.max(count, max);

            }
            i++;
        }

        return max;
    }
}
