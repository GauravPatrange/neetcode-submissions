class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int mx = 0;
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                int count = map.get(s.charAt(j));
                map.put(s.charAt(j),count+1);
            }else{
                map.put(s.charAt(j),1);
            }

            if(map.size() == j-i+1){
                mx = Math.max(mx, j-i+1);
                j++;
            }else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    if(map.containsKey(s.charAt(i))){
                        int count = map.get(s.charAt(i));
                        count--;
                        map.put(s.charAt(i),count);
                    }
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return mx;
        
    }
}
