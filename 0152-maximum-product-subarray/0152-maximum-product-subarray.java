class Solution {
    public int maxProduct(int[] nums) {
        int mx=nums[0],mn=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int n=nums[i];
            if(n<0){
                int t=mx;
                mx=mn;
                mn=t;
            }
            mx=Math.max(n,mx*n);
            mn=Math.min(n,mn*n);
            ans=Math.max(ans,mx);
        }
        return ans;
    }
}