class Solution {
    public boolean validPalindrome(String s) {
        int cnt=0;
        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    return isPalindrome(s,i+1,s.length()-1-i)|| isPalindrome(s,i,s.length()-1-i-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        
    }
}