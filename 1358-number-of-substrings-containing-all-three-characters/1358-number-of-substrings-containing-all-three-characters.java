class Solution {
    public int numberOfSubstrings(String s) {
        int[] ct=new int[3];
        int l=0,ans=0,n=s.length();
        for(int r=0;r<n;r++){
            ct[s.charAt(r)-'a']++;
            while(ct[0]>0 && ct[1]>0 && ct[2]>0){
                ans+=n-r;
                ct[s.charAt(l)-'a']--;
                l++;
            }
        }
        return ans;
    }
}