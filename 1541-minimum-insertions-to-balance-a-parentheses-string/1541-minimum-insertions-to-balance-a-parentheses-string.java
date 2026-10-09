class Solution {
    public int minInsertions(String s) {
        int op=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                op++;
            }
            else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    i++;
                } 
                else{
                    ans++;
                }
                if(op>0){
                    op--;
                }
                else{
                    ans++;
                }
            }
        }
        return ans+op*2;
    }
}