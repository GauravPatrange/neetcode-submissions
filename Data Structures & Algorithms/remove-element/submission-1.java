class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;

        int count=0;
        for(int z=0;z<nums.length;z++){
            if(nums[z]!=val){
                count++;
            }
        }


        while(i<j){
            if(nums[i] == val){
                int temp = nums[i];  // ← add this
        nums[i] = nums[j];
        nums[j] = temp;  
                j--;
            }else{
                i++;
            }
           
        }

        return count;
    }


}