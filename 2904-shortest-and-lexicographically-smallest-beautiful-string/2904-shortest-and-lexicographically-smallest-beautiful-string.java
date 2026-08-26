class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String answer="";
        int l=0;
        int ones=0;
        for(int r=0;r<s.length();r++){
            if (s.charAt(r)=='1'){
                ones++;
            }
            while(ones>k){
                if (s.charAt(l)=='1'){
                    ones--;
                }
                l++;
            }
            while(ones==k && s.charAt(l)=='0'){
                l++;
            }
            if(ones==k){
                String candidate=s.substring(l,r+1);
                if(answer.isEmpty() ||
                    candidate.length() < answer.length() || (candidate.length()==answer.length() && candidate.compareTo(answer)<0)){
                    answer=candidate;
                }
            }
        }
        return answer;
    }
}