
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        long k=(long) k1+k2;
        int[] diff=new int[n];
        int l=0;
        long sd=0;
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            l=Math.max(l,diff[i]);
            sd+=diff[i];
        }
        if(sd<=k){
            return 0;
        }
        long[] freq=new long[l+1];
        for(int value:diff){
            freq[value]++;
        }
        for(int i=l;i>0 && k>0;i--){
            if(freq[i]==0){
                continue;
            }
            if(k>=freq[i]){
                k-=freq[i];
                freq[i-1]+=freq[i];
                freq[i]=0;
            } 
            else{
                freq[i]-=k;
                freq[i-1]+=k;
                k=0;
            }
        }
        long res=0;
        for(int i=0;i<=l;i++){
            res+=freq[i]*i*i;
        }
        return res;
    }
}