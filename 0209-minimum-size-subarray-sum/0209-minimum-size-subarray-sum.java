class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int currSum=0, left=0,right=0;
        int ans=Integer.MAX_VALUE;
        for( right=0;right<nums.length;right++){
            currSum+=nums[right];
            while(currSum>=target){
                ans=Math.min(ans,right-left+1);
                currSum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}