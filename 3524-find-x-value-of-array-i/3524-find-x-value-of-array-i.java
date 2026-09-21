class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res=new long[k];
        int[] freq=new int[k];
        for (int n:nums){
            n%=k;
            int[] curr=new int[k];
            curr[n]=1;
            for(int x=0;x<k;x++)
                curr[x*n%k]+=freq[x];
            freq=curr;
            for(int x=0;x<k;x++)
                res[x]+=freq[x];
        }
        return res; 
    }
}