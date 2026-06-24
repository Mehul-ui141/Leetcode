class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        else if(x<0 || x%10==0){
            return false;
        }
        int og=x;
        int rev=0;
        while(x>0){
            int dg=x%10;
            x/=10;
            rev=rev*10+dg;
        }
        if(og==rev){
            return true;
        }
        else{
            return false;
        }
    }
}