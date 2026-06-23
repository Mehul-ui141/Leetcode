class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int x=0;x<=n;x++){
            int count=0;
            for(int i=0;i<n;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
            if(count == x){
                return x;
            }
        }
        return -1;
    }
}