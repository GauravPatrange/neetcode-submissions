class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                str+=s.charAt(i);
            }
        }
        str = str.toLowerCase();
        char[] revS = str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp=revS[i];
            revS[i]=revS[j];
            revS[j]=temp;
            i++;
            j--;
        }


        String rev = new String(revS);

        return str.equals(rev)? true : false;
        
    }
}
