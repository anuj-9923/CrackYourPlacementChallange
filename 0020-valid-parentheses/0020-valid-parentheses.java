class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                st.push(ch);
                continue;
            }
            if(st.isEmpty())
                return false;
            char check;
            switch(ch){
                case ')':
                    check=st.pop();
                    if(check=='{' || check=='[')
                        return false;
                    break;
                case '}':
                    check=st.pop();
                    if(check=='(' || check=='[')
                        return false;
                    break;
                case ']':
                    check=st.pop();
                    if(check=='{' || check=='(')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
}