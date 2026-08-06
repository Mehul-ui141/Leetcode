class Solution {
    public int smallestNumber(int n, int t) {
        int res=n/10,r=n%10;
        int c=t/gcd(res+(10-res)/10,t);
        int nxt=((r+c-1)/c)*c;
        int x=nxt-(nxt-10)*(nxt/10);
        return res*10+x;
    }
    public int gcd(int a,int b){
        return(b==0)?a:gcd(b,a%b);
    }
}