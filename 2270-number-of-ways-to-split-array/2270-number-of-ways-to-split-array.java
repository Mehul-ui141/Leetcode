class Solution {
    public int waysToSplitArray(int[] nums) {
        int ct=0;
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        long l=0;
        for(int i=0;i<n-1;i++){
            l+=nums[i];
            long r=sum-l;
            if(l>=r){
                ct++;
            }
        }
        return ct;
    }
}