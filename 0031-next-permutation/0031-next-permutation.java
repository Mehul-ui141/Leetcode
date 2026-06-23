class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1])
                break;
        }
        if(i>=0){
            int j;
            for(j=n-1;j>i;j--){
                if(nums[j]>nums[i])
                    break;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        rev(nums,i+1,n-1);
    }
    void rev(int nums[],int y,int z){
        while(y<z){
            int temp=nums[y];
            nums[y]=nums[z];
            nums[z]=temp;
            y++;
            z--;
        }
    }
}