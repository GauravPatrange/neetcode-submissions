class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
              HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char[] ch= word.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(word);
            

            // if(map.containsKey(str)){
            //     String val = map.get(str);
            //     map.put(str, val+" "+word);
            // }else{
            //     map.put(str, word);
            // }
            
        }

        return new ArrayList<>(map.values());

        // List<List<String>> list = new ArrayList<>();

        // for(Map.Entry<String, String> entry : map.entrySet()){
        //     String word = entry.getValue();
        //     list.add(Arrays.asList(word.split(" ")));
        // }

        // map.forEach((key, value) -> System.out.println(key + " Value: " + value));

        // return list;
    }
}
