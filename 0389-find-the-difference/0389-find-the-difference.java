class Solution {
    public char findTheDifference(String s, String t) {
        char a=0;
        for(int i=0;i<s.length();i++){
            a^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            a^=t.charAt(i);
        }
        return a;
    }
}