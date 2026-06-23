class Solution {
    public int maxTotalFruits(int[][] fruits, int sp, int k) {
        int n=fruits.length;
        int l=0;
        int ans=0;
        long sum=0;
        for(int r=0;r<n;r++){
            sum+=fruits[r][1];
            while(l<=r && Math.min(2*Math.max(0,sp-fruits[l][0])+Math.max(0,fruits[r][0]-sp),
                    2*Math.max(0,fruits[r][0]-sp)+Math.max(0,sp-fruits[l][0]))>k){
                sum-=fruits[l][1];
                l++;
            }
            ans=Math.max(ans,(int)sum);
        }
        return ans;
    }
}