class Solution {
    public int characterReplacement(String s, int k) {
         Map<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int ans =0;
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);

            Integer mostFreq = map.entrySet().stream().map(entry -> entry.getValue())
                    .max(Integer::compareTo).get();
            if(j-i+1 - mostFreq <= k){
                ans = Math.max(ans, j-i+1);
                j++;
            }else{
                while(j-i+1 - mostFreq > k){
                    if(map.containsKey(s.charAt(i))){
                        int freq = map.get(s.charAt(i));
                        map.put(s.charAt(i),freq-1);
                        if(map.get(s.charAt(i))==0){
                            map.remove(s.charAt(i));
                        }
                    }
                    i++;
                }
                j++;
            }

        }
        return ans;
    }
}
