class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=0;
        for(int x:piles){
            r=Math.max(r,x);
        }
        while(l<r){
            int m=l+(r-l)/2;
            long hrs=0;
            for(int x:piles){
                hrs+=(x+m-1)/m;
            }
            if(hrs<=h){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}