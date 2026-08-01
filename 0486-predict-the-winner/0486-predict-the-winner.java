class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        if(n%2==0){
            return true;
        }
        int[] ans=nums.clone();
        for(int i=n-2;i>=0;--i){
            for (int j=i+1;j<n;++j){
                ans[j]=Math.max(nums[i]-ans[j],nums[j]-ans[j-1]);
            }
        }
        return ans[n-1]>=0;
    }
}