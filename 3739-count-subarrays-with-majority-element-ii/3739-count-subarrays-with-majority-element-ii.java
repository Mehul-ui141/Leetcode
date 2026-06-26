class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        long ct=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                nums[i]=1;
            } 
            else{
                nums[i]=-1;
            }
        }
        int[] p=new int[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        int s=n;
        int[] freq=new int[2*n+1];
        freq[s]=1;
        long valid=0;
        int lSum=0;
        for(int i=0;i<n;i++){
            if(p[i]>lSum){
                valid+=freq[lSum+s];
            } 
            else{
                valid-=freq[p[i]+s];
            }
            ct+=valid;
            freq[p[i]+s]++;
            lSum=p[i];
        }
        return ct;
    }
}