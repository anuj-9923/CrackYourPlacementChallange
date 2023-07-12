class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            for(int j=i;j<haystack.length();j++){
                String sub=haystack.substring(i,j+1);
                if(sub.equals(needle))
                    return i;
            }
        }
        return -1;
    }
}