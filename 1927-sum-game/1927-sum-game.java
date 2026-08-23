class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int lsum=0,rsum=0;
        int LQ=0,RQ=0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?')
                LQ++;
            else
                lsum+=num.charAt(i)-'0';
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?')
                RQ++;
            else
                rsum+=num.charAt(i)-'0';
        }
        return (lsum-rsum)*2!=(RQ-LQ)*9;
    }
}