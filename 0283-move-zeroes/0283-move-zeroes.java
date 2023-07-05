class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int idx=0;
        for(int i:nums){
            if(i==0)
                count++;
            else
                nums[idx++]=i;
        }
        while(count>0){
            nums[idx++]=0;
            count--;
        }
        
    }
}