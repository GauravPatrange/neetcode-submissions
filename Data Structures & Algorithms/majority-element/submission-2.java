class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count =0;
        for(int val : nums){
          
            if(count == 0 ){
                res =val;
            }

            if(res == val){
                count++;
            }else{
                count--;
            }

        }
        return res;
    }
}