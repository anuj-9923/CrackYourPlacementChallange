class Solution {
    public int strStr(String haystack, String needle) {
        int currIdx=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(currIdx))
                currIdx++;
            else{
                i=i-currIdx;
                currIdx=0;
            }
            if(currIdx==needle.length())
                return i-needle.length()+1;
        }
        return -1;
    }
}
