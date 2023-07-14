class Solution {
    public String longestCommonPrefix(String[] strs) {
       String comn="";
        for(int i=0;i<strs[0].length();i++){
            boolean flag=true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()>i && strs[0].charAt(i)!=strs[j].charAt(i)){
                    return comn;
                }
                if(strs[j].length()<=i)
                    flag=false;
            }
            if(flag){
                comn+=strs[0].charAt(i);
            }
        }
        return comn;
    }
}