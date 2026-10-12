class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] b=new int[30];
        long res=0, m=1000000007;
        for(int n:nums){
            for(int i=0;i<30;i++){
                if((n & 1<<i)!=0){
                    b[i]++;
                }
            }
        }
        while(k-->0){
            long ans=0;
            for(int i=0;i<30;i++){
                if(b[i]>0){
                    ans|=1L<<i;
                    b[i]--;
                }
            }
            res=(res+ans*ans)%m;
        }
        return (int) res;
    }
}