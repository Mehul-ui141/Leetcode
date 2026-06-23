class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                arr[i]=i+1;
                arr[n-i-1]=-(i+1);
            }
        }
        else{
            arr[n/2]=0;
            for(int i=0;i<n/2;i++){
                arr[i]=i+1;
                arr[n-i-1]=-(i+1);
            }
        }
        return arr;
    }
}