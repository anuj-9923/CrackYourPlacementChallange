class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int idx=0,uniEle=0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[idx++]=nums[i];
                uniEle++;
                i=j++;
            }else{
                j++;
            }
        }
        uniEle++;
        
            nums[idx]=nums[i];
        return uniEle;
        
    }
}