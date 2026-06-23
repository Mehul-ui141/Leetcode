class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int ans[]=new int[n];
        int ct[]=new int[n+1];
        int cm=0;
        for(int i=0;i<n;i++){
            ct[A[i]]++;
            if(ct[A[i]]==2){
                cm++;
            }
            ct[B[i]]++;
            if(ct[B[i]]==2){
                cm++;
            }
            ans[i]=cm;
        }
        return ans;
    }
}