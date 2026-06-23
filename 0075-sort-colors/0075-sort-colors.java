class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]<nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
    }
}