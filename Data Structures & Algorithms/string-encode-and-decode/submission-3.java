class Solution {

    public String encode(List<String> strs) {
        String s1 = "";
        for(String s : strs){
            s1=s1+s+"à";
        }
        System.out.println(s1);
        return s1;

    }

    public List<String> decode(String str) {

        List<String> strs = new ArrayList<>();

        String s = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'à'){
                strs.add(s);
                s="";
                continue;
            }
            s=s+str.charAt(i)+"";
        }
        return strs;
    }
}
