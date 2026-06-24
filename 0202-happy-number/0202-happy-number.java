class Solution {
    int next(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int s=n;
        int f=n;
        do{
            s=next(s);
            f=next(next(f));
        }
        while(s!=f);
        return s==1;
    }
}