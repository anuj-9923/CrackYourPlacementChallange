class Solution {
    public void sortColors(int[] nums) {
        int zero=0,ones=0,twos=0;
        for(int n : nums){
            if(n==0)
                zero++;
            else if(n==1)
                ones++;
            else 
                twos++;
        }
        for(int i=0;i<nums.length;i++){
            if(zero!=0){
                nums[i]=0;
                zero--;
            }else if(ones!=0){
                nums[i]=1;
                ones--;
            }else{
                nums[i]=2;
            }
        }
    }
}