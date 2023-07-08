class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=0;
       // int i=0,j=0;
//         while(i<m && j<n){
//             if(nums1[i]>nums2[j]){
//                 int temp=nums1[i];
//                 nums1[i]=nums2[j];
//                 nums2[j]=temp;
//                 j++;
//             }else{
//                 i++;
//             }
                
//         }
//         while(j<n){
//             nums1[i++]=nums2[j++];
//         }
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}