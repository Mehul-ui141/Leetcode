public class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<=1){
            return s;
        }
        int len=1;
        int st=0,end=0;
        boolean[][] res=new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length();++i){
            res[i][i]=true;
            for(int j=0;j<i;++j){
                if (s.charAt(j)==s.charAt(i) && (i-j<=2 || res[j+1][i-1])){
                    res[j][i]=true;
                    if(i-j+1>len){
                        len=i-j+1;
                        st=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(st,end+1);
    }
}