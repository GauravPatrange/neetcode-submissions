class Solution {
    public boolean validPalindrome(String s) {
        int l = 0;
        int h = s.length()-1;

        while(l<h){
            if(s.charAt(l) != s.charAt(h)){
                return isPalindrome(s.substring(l+1,h+1)) || 
                isPalindrome(s.substring(l,h));
            }
            l++;
            h--;
        }
        return true;
        
    }

    public boolean isPalindrome(String s){
        int l = 0;
        int h = s.length()-1;

        while(l<h){
            if(s.charAt(l) != s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
        
}