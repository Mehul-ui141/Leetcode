class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1, -1};
        int l=binarySearch(nums,target,true);
        int r=binarySearch(nums,target,false);
        res[0]=l;
        res[1]=r;
        return res;        
    }
    public int binarySearch(int[] nums, int target, boolean isSearchingLeft) {
        int l=0;
        int r=nums.length-1;
        int idx=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>target){
                r=m-1;
            } 
            else if(nums[m]<target){
                l=m+1;
            } 
            else{
                idx=m;
                if(isSearchingLeft){
                    r=m-1;
                } 
                else{
                    l=m+1;
                }
            }
        }

        return idx;
    }

}