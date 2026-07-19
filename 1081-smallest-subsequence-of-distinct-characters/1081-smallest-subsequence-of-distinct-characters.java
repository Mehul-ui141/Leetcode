class Solution {
    public String smallestSubsequence(String s) {
        int[] l=new int[26];
        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']++;
        }
        boolean[] stk=new boolean[26];
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            l[ch-'a']--;
            if(stk[ch-'a']){
                continue;
            }
            while(st.length()>0 && st.charAt(st.length()-1)>ch && l[st.charAt(st.length()-1)-'a']>0){
                stk[st.charAt(st.length()-1)-'a']=false;
                st.deleteCharAt(st.length()-1);
            }
            st.append(ch);
            stk[ch-'a']=true;
        }
        return st.toString();
    }
}