class Solution {
    public boolean areOccurrencesEqual(String s) {
        int a[]=new int[26];
        int f=0;
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=0){
                if(f==0){
                    f=a[i];
                }
                else if(a[i]!=f){
                    return false;
                }
            }
        }
        return true;
    }
}