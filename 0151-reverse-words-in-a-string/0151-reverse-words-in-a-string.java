class Solution {
    public String reverseWords(String s) {
        String rvs="";
        String curr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                curr+=ch;
            }else{
                if(curr!=""){
                    if(rvs!="")
                        rvs=curr+" "+rvs;
                    else
                        rvs=curr;
                    curr="";
                }
            }
        }
        if(rvs=="")
            rvs=curr;
        else
            if(curr!="")
            rvs=curr+" "+rvs;
        return rvs;
    }
}