class Solution {
    public String lexPalindromicPermutation(String s, String t) {
        int n=s.length();
        int half=s.length()/2;
        int f[]=new int[26];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
        }
        int odd=-1;
        for(int i=0;i<26;i++){
            if(f[i]%2==1){
                if(odd!=-1){
                    return "";
                }
                odd=i;
            }
        }
        int pos=0;
        while(pos<half && f[t.charAt(pos)-'a']>1){
            f[t.charAt(pos)-'a']-=2;
            pos++;
        }
        if(pos==half){
            StringBuilder ans=new StringBuilder();
            ans.append(t.substring(0,half));
            StringBuilder str=new StringBuilder(ans);
            if(n%2==1){
                ans.append((char)('a'+odd));
            }
            str.reverse();
            ans.append(str);
            if(ans.toString().compareTo(t)>0){
                return ans.toString();
            }
        }
        int st=half==pos?half-1:pos;
        for(int i=st;i>=0;i--){
            if(i<pos){
                f[t.charAt(i)-'a']+=2;
            }
            for(int k=0;k<26;k++){
                if(f[k]>1 && k>(t.charAt(i)-'a')){
                    StringBuilder ans=new StringBuilder();
                    ans.append(t.substring(0,i));
                    ans.append((char)('a'+k));
                    f[k]-=2;
                    for(int x=0;x<26;x++){
                        while(f[x]>1){
                            ans.append((char)('a'+x));
                            f[x]-=2;
                        }
                    }
                    StringBuilder str=new StringBuilder(ans);
                    str.reverse();
                    ans.append(str);
                    if(n%2==1){
                        ans.insert(n/2,(char)('a'+odd));
                    }
                    return ans.toString();
                }
            }
        }
        return "";
    }
}