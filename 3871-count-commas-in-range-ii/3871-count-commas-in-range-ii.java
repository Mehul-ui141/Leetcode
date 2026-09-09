class Solution {
    public long countCommas(long n) {
        long st=1000;
        long cm=1;
        long ans=0;
        while(st<=n){
            long end=(st>n/1000)?n:st*1000-1;
            long ct=end-st+1;
            ans+=ct*cm;
            st*=1000;
            ++cm;
        }
        return ans;
    }
}