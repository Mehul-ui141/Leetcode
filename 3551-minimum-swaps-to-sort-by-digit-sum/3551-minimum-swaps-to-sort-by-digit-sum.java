class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] ans=new int[n][3];
        for(int i=0;i<n;i++){
            int s=0,x=nums[i];
            while(x>0){
                s+=x%10;
                x/=10;
            }
            ans[i][0]=s;
            ans[i][1]=nums[i];
            ans[i][2]=i;
        }
        Arrays.sort(ans,(p,q)->p[0]!=q[0]?Integer.compare(p[0],q[0]):Integer.compare(p[1],q[1]));
        boolean[] b=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++){
            if(b[i] || ans[i][2]==i){
                continue;
            }
            int j=i,len=0;
            while(!b[j]){
                b[j]=true;
                j=ans[j][2];
                len++;
            }
            res+=len-1;
        }
        return res;
    }
}