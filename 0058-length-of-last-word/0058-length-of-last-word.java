class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int ct=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!= ' '){
                ct++;
            }
            else{
                if(ct>0){
                    return ct;
                }
            }
        }
        return ct;
    }
}