class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length(),j=0;
        int[] freq=new int[26];
        char[] c=s.toCharArray();
        for(int i=0;i<n>>1;i++){
            freq[(c[i] & 31)-1]++;
        }
        for(int i=0;i<26;i++){
            while(freq[i]-->0){
                c[j]=(char)(97+i);
                c[n-1-j++]=(char)(97+i);
            }
        }
        return new String(c);
    }
}