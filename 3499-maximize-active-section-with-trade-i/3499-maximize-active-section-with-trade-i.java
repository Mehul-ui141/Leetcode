class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                ones++;
            }
        }
        s="1"+s+"1";
        int n=s.length();
        int i=0;
        int ans=ones;
        while(i<n && s.charAt(i)=='1'){
            i++;
        }
        int ct1=0;
        while(i<n && s.charAt(i)=='0'){
            ct1++;
            i++;
        }
        while(i<n){
            int ct2=0;
            while(i<n && s.charAt(i)=='1'){
                ct2++;
                i++;
            }
            if(ct2==0)
                break;
            int ct3=0;
            while(i<n && s.charAt(i)=='0'){
                ct3++;
                i++;
            }
            if(ct3==0)
                break;
            ans=Math.max(ans,ones+ct1+ct3);
            ct1=ct3;
        }
        return ans;
    }
}