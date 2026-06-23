class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int r1=0;
        int r2=0;
        for(int i=0;i<n;i++){
            int t=Math.max(r1,r2+nums[i]);
            r2=r1;
            r1=t;
        }
        return r1;
    }
}