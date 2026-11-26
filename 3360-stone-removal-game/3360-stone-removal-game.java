class Solution {
    public boolean canAliceWin(int n) {
        int rm=10;
        boolean turn=true;
        while(n>=rm){
            n-=rm;
            rm--;
            turn=!turn;
        }
        return !turn;
    }
}