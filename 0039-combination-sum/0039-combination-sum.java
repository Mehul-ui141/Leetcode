class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        solve(0,candidates,target,new ArrayList<>());
        return ans;
    }
    void solve(int i,int[] a,int target,List<Integer> cur){
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(i==a.length || target<0){
            return;
        }
        cur.add(a[i]);
        solve(i,a,target-a[i],cur);
        cur.remove(cur.size()-1);
        solve(i+1,a,target,cur);
    }
}