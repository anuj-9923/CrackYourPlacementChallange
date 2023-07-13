class Solution {
    public String reverseWords(String s) {
       Scanner words=new Scanner(s);
        String res="";
        while(words.hasNext()){
            res=words.next()+" "+res;
        }
        return res.trim();
    }
}