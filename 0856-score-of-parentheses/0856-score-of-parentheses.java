class Solution {
    public int scoreOfParentheses(String s) {
        int sc=0,d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                d++;
            }
            else{
                d--;
                if(s.charAt(i-1)=='('){
                    sc+=1<<d;
                }
            }
        }
        return sc;
    }
}