class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!set.add(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}