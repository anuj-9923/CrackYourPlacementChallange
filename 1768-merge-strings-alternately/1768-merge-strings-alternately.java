class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergeStr="";
        int len1 =word1.length(), len2=word2.length(),i=0,j=0;
        while(i<len1 || j<len2){
            if(i<len1){
                mergeStr+=word1.charAt(i++);
            }
            if(j<len2){
                mergeStr+=word2.charAt(j++);
            }
        }
        return mergeStr;
    }
}