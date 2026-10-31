class Solution {
    public int uniquePaths(int[][] grid) {
        final int mod=1_000_000_007;
        int[] res=new int[grid[0].length];
        res[0]=1;
        for(int[] x:grid){
            int r=0;
            for(int i=0;i<x.length;i++){
                if(x[i]==1){
                    int t=r;
                    r=res[i];
                    res[i]=t;
                }
                else{
                    r=res[i]=(r+res[i])%mod;
                }
            }
        }
        return res[res.length-1];
    }
}