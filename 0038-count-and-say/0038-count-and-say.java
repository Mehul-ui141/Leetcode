class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            StringBuilder s1= new StringBuilder();
            int ct=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    ct++;
                }
                else{
                    s1.append(ct);
                    s1.append(s.charAt(j-1));
                    ct=1;
                }
            }
            s1.append(ct);
            s1.append(s.charAt(s.length()-1));
            s=s1.toString();
        }
        return s;
    }
}