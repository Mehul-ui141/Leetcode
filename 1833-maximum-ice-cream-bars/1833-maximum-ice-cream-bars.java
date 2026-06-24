class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);
        int ct=0;
        for(int i=0;i<n;i++){
            if(coins<costs[i]){
                break;
            }
            coins-=costs[i];
            ct++;
        }
        return ct;
    }
}