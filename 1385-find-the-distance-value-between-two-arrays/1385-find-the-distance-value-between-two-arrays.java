class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ct=0;
        for(int n:arr1){
            if(isValid(n, arr2, d)){
                ct++;
            }
        }
        return ct;
    }
    boolean isValid(int n, int[] arr, int d){
        for(int x:arr){
            if(Math.abs(x-n)<=d){ 
                return false;
            }
        }
        return true;
    }
}