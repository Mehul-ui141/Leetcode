class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int curr=prices[i]-min;
                if(curr>profit){
                    profit=curr;
                }
            }
        }
        return profit;
    }
}