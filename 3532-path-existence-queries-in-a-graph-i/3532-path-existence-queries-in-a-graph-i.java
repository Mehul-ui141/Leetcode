class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int[] res=new int[n];
        res[0]=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff){
                res[i]=res[i-1];
            } 
            else{
                res[i]=res[i-1]+1;
            }
        }
        boolean[] ans=new boolean[queries.length];
        for (int i=0;i<queries.length;i++){
            int u=queries[i][0];
            int v=queries[i][1];
            ans[i]=(res[u]==res[v]);
        }
        return ans;
    }
}