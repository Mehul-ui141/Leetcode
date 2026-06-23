class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int ct=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                ct++;
                max=Math.max(max,ct);
            }
            else{
                ct=0;
            }
        }
        return max;
    }
}