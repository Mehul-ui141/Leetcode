class Solution {
    public String longestCommonPrefix(String[]strs) {
        String res="";
        Arrays.sort(strs);
        char[]first=strs[0].toCharArray();
        char[]last=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(i>=last.length||first[i]!=last[i])
                break;
            res=res+first[i];
        }
        return res;
    }
}