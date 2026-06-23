class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int y=nums[n-1]*nums[n-2]*nums[n-3];
        int z=nums[0]*nums[1]*nums[n-1];
        return Math.max(y,z);
    }
}