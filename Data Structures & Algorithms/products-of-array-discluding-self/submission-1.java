class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int pre = 1;
        int i=0;
        while(i<result.length){
            result[i]=pre;
            pre *=nums[i];
            i++;
        }
        
        int post=1;
        int j=result.length-1;
        while(j>=0){
            result[j]*=post;
            post*=nums[j];
            j--;
        }
        return result;
    }
}  
