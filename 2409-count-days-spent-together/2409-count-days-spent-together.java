class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        return Math.max(0,Math.min(ct(leaveAlice),ct(leaveBob))-Math.max(ct(arriveAlice),ct(arriveBob))+1);
    }
        int ct(String s){
        var x=(s.charAt(0)-'0')*10+(s.charAt(1)-'0');
        var y=(s.charAt(3)-'0')*10+(s.charAt(4)-'0');
        return (275*x)/9-2*((x+9)/12)+y-30;
    }
}
