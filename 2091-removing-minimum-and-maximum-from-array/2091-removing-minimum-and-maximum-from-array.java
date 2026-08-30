class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[l]){
                l=i;
            }
            if(nums[i]>nums[r]){
                r=i;
            }
        }
        if(l<r){
            int temp=l;
            l=r;
            r=temp;
        }
        int ans=n;
        for(int i=0;i<=n;i++){
            int t=0;
            if(r>=i){
                t=n-r;
            }
            else if(l>=i){
                t=n-l;
            }       
            ans=Math.min(ans,i+t);
        }
        return ans;
    }
}