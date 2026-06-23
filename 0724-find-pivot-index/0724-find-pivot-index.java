class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int lt=0;
        for(int i=0;i<n;i++){
            int rt=total-lt-nums[i];
            if(lt==rt){
                return i;
            }
            lt+=nums[i];
        }
        return -1;
    }
}