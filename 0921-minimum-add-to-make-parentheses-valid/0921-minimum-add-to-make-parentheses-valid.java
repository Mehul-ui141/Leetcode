class Solution {
    public int minAddToMakeValid(String s) {
        int op=0,add=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                op++;
            }
            else{
                if(op>0){
                    op--;
                }
                else{
                    add++;
                }
            }
        }
        return op+add;
    }
}