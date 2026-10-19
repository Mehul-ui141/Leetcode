class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int ct=0,st=0;
        for(int x:nums){
            if(x==target){
                ct++;
            }
            if(x<target){
                st++;
            }
        }
        while(ct--!=0){
            ans.add(st++);
        }
        return ans;
    }
}