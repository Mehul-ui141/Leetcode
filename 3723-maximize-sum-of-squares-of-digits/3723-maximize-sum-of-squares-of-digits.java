class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num){
            return "";
        }
        StringBuilder ans=new StringBuilder();
        while(num-->0){
            int dg=Math.min(9,sum);
            ans.append(dg);
            sum-=dg;
        }
        return sum==0?ans.toString():"";
    }
}