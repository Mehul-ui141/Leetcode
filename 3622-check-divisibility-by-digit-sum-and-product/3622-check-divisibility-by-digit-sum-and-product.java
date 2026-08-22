class Solution {
    public boolean checkDivisibility(int n) {
        int og=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int dg=n%10;
            sum+=dg;
            prod*=dg;
            n/=10;
        }
        int div=sum+prod;
        return og % div == 0;
    }
}