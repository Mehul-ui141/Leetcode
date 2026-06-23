class Solution {
    public boolean isIsomorphic(String s, String t) {
        int y[]= new int[256];
        int z[]= new int[256];
        for(int i=0;i<s.length();i++){
            if(y[s.charAt(i)]!=z[t.charAt(i)]){
                return false;
            }
            y[s.charAt(i)]=i+1;
            z[t.charAt(i)]=i+1;
        }
        return true;
    }
}