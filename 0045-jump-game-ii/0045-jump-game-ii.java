class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return 0;
        }
        int jp=0,end=0,max=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==end){
              jp++;
              end=max;  
              if(end>=n-1)
                break;
            }
        }
        return jp;
    }
}