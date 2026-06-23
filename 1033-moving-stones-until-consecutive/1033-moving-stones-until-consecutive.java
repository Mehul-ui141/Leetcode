class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int n[]=new int[]{a,b,c};
        Arrays.sort(n);
        a=n[0];
        b=n[1];
        c=n[2];
        int min;
        int max=c-a-2;
        if(b-a==1 && c-b==1){
            min=0;
        }
        else if(b-a<=2 || c-b<=2){
            min=1;
        }
        else{
            min=2;
        }
        return new int[]{min,max};
    }
}