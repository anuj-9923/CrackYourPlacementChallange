class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> triplet=new HashSet<>();
        Arrays.sort(nums);
        if(nums[0]>0 && target<0) return new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length-1;j++){
               int l=j+1,k=nums.length-1;
            while(l<k){
                int sum=nums[i] + nums[j] +nums[l]+ nums[k];
                if(sum==target){
                    triplet.add(Arrays.asList(nums[i],nums[j],nums[l],nums[k]));
                    k--;
                }else if(sum>target)
                    k--;
                else{
                    l++;
                }
             }
           }
        }
        return new ArrayList<>(triplet);
    }
}