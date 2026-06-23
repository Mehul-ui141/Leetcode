class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
          if(n==0){
            return 0;
        }
        int count=1;
        int longest=1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i+1]-nums[i]==1){
                count++;
            }
            else if(nums[i+1]==nums[i]){
                count=count;
            }
            else{
                longest=Math.max(longest,count);
                count=1;
            }
        }
        return longest=Math.max(longest,count);
    }
}