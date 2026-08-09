class Solution {
    public int dfs(int i, int m, int[] piles, Map<Integer, Integer> map) {
        int n=piles.length;
        if(i+m*2>=n){
            return piles[i];
        }
        int key=(i<<8) | m;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int res=Integer.MAX_VALUE;
        for(int k=1;k<=m*2;k++){
            res=Math.min(res,dfs(i+k,Math.max(m,k),piles,map));
        }
        int val=piles[i]-res;
        map.put(key,val);
        return val;
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        for(int i=n-2;i>=0;i--){
            piles[i] += piles[i + 1];
        }
        Map<Integer,Integer> map=new HashMap<>();
        return dfs(0,1,piles,map);
    }
}