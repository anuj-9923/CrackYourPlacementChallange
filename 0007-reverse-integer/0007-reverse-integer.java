class Solution {
    public int reverse(int x) {
        boolean flag=false;
        if(x<0){
            flag=true;
            x=-x;
        }
        int revs=0;
        while(x!=0){
            int rem=x%10;
            if(revs>(Integer.MAX_VALUE-rem)/10)
                return 0;
            revs=revs*10+rem;
            x=x/10;
        }
        return flag?-revs:revs;
    }
}