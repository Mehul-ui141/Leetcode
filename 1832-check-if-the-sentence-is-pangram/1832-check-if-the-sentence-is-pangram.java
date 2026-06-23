class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            arr[sentence.charAt(i) - 'a'] = true;
        }
        for(boolean curr:arr){
            if(!curr){
                return false;
            }
        }
        return true;
    }
}