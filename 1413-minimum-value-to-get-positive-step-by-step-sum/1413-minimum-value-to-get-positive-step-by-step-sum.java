class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int sum=0;
        int min=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<min){
                min=sum;
            }
        }
        return 1-min;
    }
}