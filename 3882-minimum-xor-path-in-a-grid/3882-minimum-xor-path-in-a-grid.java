class Solution {
    public int minCost(int[][] grid) {
        int n=grid[0].length;
        boolean[][] dp=new boolean[n][1024];
        dp[0][0]=true;
        for(int[] row:grid){
            for(int i=0;i<n;i++){
                boolean[] nxt=new boolean[1024];
                for(int j=0;j<1024;j++){
                    if(dp[i][j] || i>0 && dp[i-1][j]){
                        nxt[j^row[i]]=true;
                    }
                }
                dp[i]=nxt;
            }
        }
        int j=0;
        while(!dp[n-1][j]){
            j++;
        }
        return j;
    }
}