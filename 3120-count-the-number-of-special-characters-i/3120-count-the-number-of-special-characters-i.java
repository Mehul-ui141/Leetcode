class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> ans=new HashSet<>();
        int ct=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            ans.add(ch);
        }
        for(char ch:ans){
            if(Character.isLowerCase(ch)){
                if(ans.contains((char)(ch-32))){
                    ct++;
                }
            }
        }
        return ct;
    }
}