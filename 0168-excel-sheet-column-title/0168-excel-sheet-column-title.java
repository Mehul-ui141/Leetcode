class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        while(columnNumber>0){
            columnNumber--;
            int res=columnNumber%26;
            char ch=(char)(res+'A');
            s=ch+s;
            columnNumber/=26;
        }
        return s;
    }
}