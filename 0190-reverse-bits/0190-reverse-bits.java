class Solution {
    public int reverseBits(int n) {
        int x=0;
        for(int i=0;i<32;i++){
            x<<=1;
            x|=(n&1);
            n>>>=1;
        }
        return x;
    }
}