class Solution {
    public int hammingWeight(int n) {
        int ct=0;
        while(n!=0){
            n=n & (n-1);
            ct++;
        }
        return ct;
    }
}