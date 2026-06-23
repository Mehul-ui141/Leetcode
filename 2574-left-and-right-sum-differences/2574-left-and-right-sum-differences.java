class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
        }
        int l=0;
        for(int i=0;i<n;i++){
            int r=s-l-nums[i];
            ans[i]=Math.abs(l-r);
            l+=nums[i];
        }
        return ans;
    }
}