class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int ct=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    ct++;
                }
                int l=j-i+1;
                if(ct>l/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}