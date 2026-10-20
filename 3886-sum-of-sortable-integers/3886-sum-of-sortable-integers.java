class Solution {
    public boolean check(int[] nums,int k){
        int n=nums.length;
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<n;i+=k){
            int ct=0;
            int min=nums[i];
            int max=nums[i];
            for(int j=i;j<i+k-1;j++){
                if(nums[j]>nums[j+1]){
                    ct++;
                }
                min=Math.min(min,nums[j+1]);
                max=Math.max(max,nums[j+1]);
            }
            if(nums[i+k-1]> nums[i]){
                ct++;
            }
            if(ct>1 || prev>min){
                return false;
            }
            prev=max;
        }
        return true;
    }
    public int sortableIntegers(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int k=1;k*k<=n;k++){
            if(n%k==0){
                if(check(nums,k)){
                    ans+=k;
                }
            int ot=n/k;
            if(ot!=k && check(nums,ot)){
                ans+=ot;
            }
            }
        }
        return ans;
    }
}