class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum=0;
        int l=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while((long)nums[r]*(r-l+1)-sum>k){
                sum-=nums[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}