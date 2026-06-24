class Solution {
    public int pivotInteger(int n) {
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        int lt=0;
        for(int i=1;i<=n;i++){
            int rt=total-lt-i;
            if(lt==rt){
                return i;
            }
            lt+=i;
        }
        return -1;
    }
}