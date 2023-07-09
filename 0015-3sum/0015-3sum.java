class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplet=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
           int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i] + nums[j] + nums[k];
                if(sum==0){
                    triplet.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                }else if(sum>0)
                    k--;
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(triplet);
    }
}