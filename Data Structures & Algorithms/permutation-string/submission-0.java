class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                int freq = map.get(s1.charAt(i));
                map.put(s1.charAt(i),freq+1);
            }else{
                map.put(s1.charAt(i),1);
            }
        }
        int i=0;
        int j=0;
        int k=s1.length();
        int count = map.size();
        boolean flag= false;
        while(j<s2.length()){

            if(map.containsKey(s2.charAt(j))){
                int freq=map.get(s2.charAt(j));
                map.put(s2.charAt(j),freq-1);
                if(map.get(s2.charAt(j))==0){
                    count--;
                }
            }
            if(j-i+1 < s1.length()){
                j++;
            }else if(j-i+1 == s1.length()){
                if(count == 0){
                    flag= true;
                }
                if(map.containsKey(s2.charAt(i))){
                int freq=map.get(s2.charAt(i));
                map.put(s2.charAt(i),freq+1);
                    if(map.get(s2.charAt(i))==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
            
        }
        return flag;
    }
}
