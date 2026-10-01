class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        char[] ch=s.toCharArray();
        int i=0;
        for(char c:ch){
            if((c&3)!=1){
                ch[i++]=c;
            }
            else if(i==0 || ((c-ch[--i]+1)>>1)!=1){
                return false;
            }
        }
        return i==0;
    }
}