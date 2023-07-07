class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            //System.out.println(i);
            if(map.containsKey(diff)){
                ans[1]=i;
                ans[0]=map.get(diff);
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}