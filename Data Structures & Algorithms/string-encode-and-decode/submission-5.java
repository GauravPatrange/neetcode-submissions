class Solution {

    public String encode(List<String> strs) {

        String out = "";
        for(String val : strs){
            out =out + val.length()+"#"+val;
        }
        System.out.println(out);
        return out;

    }

    public List<String> decode(String str) {
        //5#Hello5#World

        List<String> list = new ArrayList<>();
        int i=0;
    
        while(i<str.length()){
            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            list.add(str.substring(j+1,j+1+len));
            i=j+1+len;

        }
        return list;

    }
}
