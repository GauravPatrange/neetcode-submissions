class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        int maxCount = 0;
        int res = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            if(val.getValue() > maxCount){
                maxCount=val.getValue();
                res=val.getKey();
            }
        }
        return res;
    }
}