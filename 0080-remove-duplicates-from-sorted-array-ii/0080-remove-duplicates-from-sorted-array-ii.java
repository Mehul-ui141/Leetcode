class Solution {
    public int removeDuplicates(int[] nums) {
        int id=0;
        for(int i=0;i<nums.length;i++){
            if(id<2 || nums[i]!=nums[id-2]){
                nums[id]=nums[i];
                id++;
            }
        }
        return id;
    }
}