class Solution {
    public int maxProfit(int[] prices) {
        int b1=prices[0];
        int p1=0;
        int b2=prices[0];
        int p2=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<b1){
                b1=prices[i];
            }
            if(prices[i]-b1>p1){
                p1=prices[i]-b1;
            }
            if(prices[i]-p1<b2){
                b2=prices[i]-p1;
            }
            if(prices[i]-b2>p2){
                p2=prices[i]-b2;
            }
        }
        return p2;
    }
}