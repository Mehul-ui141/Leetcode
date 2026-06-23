class Solution {
    public int characterReplacement(String s, int k) {
        int f[]=new int[26];
        int l=0,mx=0,ans=0;
        for(int r=0;r<s.length();r++){
            f[s.charAt(r)-'A']++;
            mx=Math.max(mx,f[s.charAt(r)-'A']);
            while((r-l+1)-mx>k){
                f[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}