class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[]{0,0,0};
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        System.out.println(Arrays.toString(arr));

        int j=0;
        for(int i=0;i<3;i++){
            while(arr[i]-- >0){
                nums[j++]=i;
            }

        }
        
    }
}