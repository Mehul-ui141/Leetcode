class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int mv=0;
        for(int x:nums){
            mv=Math.max(mv,x);
        }
        long[] freq=new long[mv+1];
        for(int x:nums){ 
            freq[x]++;
        }
        long[] ct=new long[mv+1];
        for(int g=1;g<=mv;g++){
            for(int x=g;x<=mv;x+=g){
                ct[g]+=freq[x];
            }
        }
        long[] res=new long[mv+1];
        for(int g=mv;g>=1;g--){
            res[g]=ct[g]*(ct[g]- 1)/2;
            for (int m=2*g;m<=mv;m+=g){
                res[g]-=res[m];
            }
        }
        long[] prefix=new long[mv+1];
        for(int g=1;g<=mv;g++){
            prefix[g]=prefix[g-1]+res[g];
        }
        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            long target=queries[i]+1;
            int l=1,r=mv;
            while(l<r){
                int m=l+(r-l)/2;
                if (prefix[m]>=target)
                    r=m;
                else
                    l=m+1;
            }
            ans[i]=l;
        }
        return ans;
    }
}