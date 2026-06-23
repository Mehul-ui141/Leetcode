class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a'];
            }
            int rem=sum%26;
            sb.append((char)('z'-rem));
        }
        return sb.toString();
    }
}

/*class Solution {
    public String weightedWordMapping(String[] words, int[] weights) {
        String ans="";
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a'];
            }
            ans+=(char)('z'-(sum%26));
        }
        return ans;
    }
}*/