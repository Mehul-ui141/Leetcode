class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int elem=nums[0];
        for(int i=0;i<n;elem++,i++){
            if(elem < nums[i]){
                ans.add(elem);
                i--;
            }
        }
        return ans;
    }
}