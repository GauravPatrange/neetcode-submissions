class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                int count = map.get(val);
                map.put(val,count+1);
            }else{
                map.put(val,1);
            }
            
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                return false;
            }
        }
        return true;
    }
}