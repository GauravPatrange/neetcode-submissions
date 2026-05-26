class Solution {
    public String longestCommonPrefix(String[] strs) {

        String out = "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            int min = Math.min(prefix.length(),strs[i].length());

            int j=0;
            while(j<min){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }

            prefix=prefix.substring(0,j);

            
        }
        return prefix.length()>0 ? prefix : "";
        
    }
}