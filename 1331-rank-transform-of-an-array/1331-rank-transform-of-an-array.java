class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=arr.clone();
        Arrays.sort(copy); 
        int m=0;
        for(int i=0;i<copy.length;i++){
            if(m==0 || copy[m-1]!=copy[i]){
                copy[m]=copy[i];
                m++;
            }
        }
        int ans[]=Arrays.copyOf(copy,m);
        for(int i=0;i<arr.length;i++){
            arr[i]=Arrays.binarySearch(ans,arr[i])+1;
        }
        return arr;
    }
}