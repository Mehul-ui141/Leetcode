class Solution {
    public boolean xorGame(int[] nums) {
        int a=0;
        for(int n:nums){
            a^=n;
        }
        return a==0 || nums.length%2==0;
    }
}