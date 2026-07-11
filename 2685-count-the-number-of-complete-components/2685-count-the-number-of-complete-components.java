class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(new ArrayList<>());
        }
        for(int[] e:edges){
            res.get(e[0]).add(e[1]);
            res.get(e[1]).add(e[0]);
        }
        boolean[] vis=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> comp=new ArrayList<>();
                dfs(i,res,vis,comp);
                boolean isComplete=true;
                for(int u:comp){
                    if(res.get(u).size()!=comp.size()-1){
                        isComplete=false;
                        break;
                    }
                }
                if(isComplete){
                    ans++;
                }
            }
        }
        return ans;
    }
    void dfs(int u,List<List<Integer>> res,boolean[] vis,List<Integer> comp){
        vis[u]=true;
        comp.add(u);
        for(int v:res.get(u)){
            if(!vis[v]){
                dfs(v,res,vis,comp);
            }
        }
    }
}