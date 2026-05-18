class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                int count = map.get(val);
                map.put(val, count+1);
            }else{
                map.put(val, 1);
            }
        }
       int[] arr = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .limit(k)
                    .toArray();

    return arr;
    
    }
}
