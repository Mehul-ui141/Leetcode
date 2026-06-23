class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int no=0;
        int pwr=0;
        while(no<n){
            no+=Math.pow(2,pwr);
            pwr++;
        }
        return no-n;
    }
}