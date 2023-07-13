class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length;
        int sum=length*(length+1)/2;
        for(int i : nums)
            sum-=i;
        return sum;
    }
}