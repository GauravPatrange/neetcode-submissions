class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character,Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int res = 0;

        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                int count = map.get(s.charAt(right));
                map.put(s.charAt(right),count+1);
            }else{
                map.put(s.charAt(right),1);
            }

            int winSize = right - left + 1;
            Integer maxFreq = map.entrySet().stream().map( x -> x.getValue()).max(Integer::compareTo).get();
            if(winSize - maxFreq <= k){
                res = Math.max(res, winSize);
                right++;
            }else{

                while(winSize - maxFreq > k){
                    if(map.containsKey(s.charAt(left))){
                        int c = map.get(s.charAt(left));
                        map.put(s.charAt(left),c-1);

                        if(map.get(s.charAt(left))==0){
                            map.remove(s.charAt(left));
                        }
                    }
                    left++;
                    winSize--;
                }
                right++;
            }


        }
        return res;
        
    }
}
