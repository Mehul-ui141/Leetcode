class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int jp=0;
        for(int i=0;i<n;i++){
            if(i>jp){
                return false;
            }
            jp=Math.max(jp,i+nums[i]);
        }
        return true;
    }
}