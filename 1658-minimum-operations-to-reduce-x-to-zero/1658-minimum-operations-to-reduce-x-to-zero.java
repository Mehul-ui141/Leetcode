class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target=total-x;
        if(target<0){
            return -1;
        }
        if(target==0){
            return n;
        }
        int l=0,sum=0,longest=-1;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(l<=r && sum>target){
                sum-=nums[l++];
            }
            if(sum==target){
                longest=Math.max(longest,r-l+1);
            }
        }
        return longest==-1?-1:n-longest;
    }
}