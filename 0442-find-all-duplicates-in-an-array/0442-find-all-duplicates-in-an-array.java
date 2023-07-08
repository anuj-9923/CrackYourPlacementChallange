class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int curr=Math.abs(nums[i])-1;
            if(nums[curr]<0)
                ans.add(Math.abs(curr)+1);
            nums[curr]*=-1;
        }
        return ans;
    }
}