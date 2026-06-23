class Solution {
    public int firstUniqChar(String s) {
        int fq[]=new int[26];
        for(int i=0;i<s.length();i++){
            fq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}