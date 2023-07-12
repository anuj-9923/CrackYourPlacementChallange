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
 // int hLen = haystack.length();
 //        int nLen = needle.length();
 //        int nIndex = 0;
 //        for(int i=0; i<hLen; i++){
 //            // as long as the characters are equal, increment needleIndex
 //            if(haystack[i]==needle[nIndex]){
 //                nIndex++;
 //            }
 //            else{
 //                // start from the next index of previous start index
 //                i=i-nIndex;
 //                // needle should start from index 0
 //                nIndex=0;
 //            }
 //            // check if needleIndex reached needle length
 //            if(nIndex==nLen){
 //                // return the first index
 //                return i-nLen+1;
 //            }
 //        }