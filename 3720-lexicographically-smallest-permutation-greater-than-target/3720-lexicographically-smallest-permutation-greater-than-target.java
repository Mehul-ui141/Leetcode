class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] ct=new int[26];
        for(char ch:s.toCharArray()){
            ct[ch-'a']++;
        }
        for(char ch:target.toCharArray()){
            ct[ch-'a']--;
        }
        for(int i=target.length()-1;i>=0;i--){
            int curr=target.charAt(i)-'a';
            ct[curr]++;
            boolean b=true;
            for(int x:ct){
                if(x<0){
                    b=false;
                    break;
                }
            }
            if(!b) continue;
            int next=-1;
            for(int c=curr+1;c<26;c++){
                if (ct[c]>0){
                    next=c;
                    break;
                }
            }
            if(next==-1) continue;
            ct[next]--;
            StringBuilder ans=new StringBuilder(target.substring(0, i));
            ans.append((char) ('a' + next));
            for(int c=0;c<26;c++){
                while(ct[c]-->0){
                    ans.append((char) ('a' + c));
                }
            }
            return ans.toString();
        }
        return "";
    }
}