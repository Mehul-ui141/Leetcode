class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        dfs(n,n,curr,ans);
        return ans; 
    }
    public void dfs(int op,int cl,StringBuilder curr,List<String> ans){
        if(op==0 && cl==0){
            ans.add(curr.toString());
            return;
        }
        if(op>0){
            curr.append('(');
            dfs(op-1,cl,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
        if(cl>op){
            curr.append(')');
            dfs(op,cl-1,curr,ans);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}