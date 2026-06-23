class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int mx=nums[0];
        int mn=nums[0];
        for(int i:nums){
            mn=Math.min(mn,i);
            mx=Math.max(mx,i);
        }
        return (long)(mx-mn)*k;
    }
}