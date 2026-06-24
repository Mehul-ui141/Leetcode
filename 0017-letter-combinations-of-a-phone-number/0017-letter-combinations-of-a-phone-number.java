class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        String a[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,0,"",a);
        return ans;
    }
    void solve(String digits,int i,String s,String a[]){
        if(i==digits.length()){
            ans.add(s);
            return;
        }
        String ch=a[digits.charAt(i)-'0'];
        for(int j=0;j<ch.length();j++){
            solve(digits,i+1,s+ch.charAt(j),a);
        } 
    }
}