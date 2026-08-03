class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] res=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int b=Integer.MIN_VALUE;
            int sum=0;
            for(int k=1;k<=3;k++){
                if(i+k>n) break;
                sum+=stoneValue[i+k-1];
                b=Math.max(b,sum-res[i+k]);
            }
            res[i]=b;
        }
        if(res[0]>0){
            return "Alice";
        }
        else if(res[0]<0){
            return "Bob";
        }
        else
            return "Tie";
    }
}