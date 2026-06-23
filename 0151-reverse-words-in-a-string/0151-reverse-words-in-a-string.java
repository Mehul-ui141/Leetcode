class Solution {
    public String reverseWords(String s) {
        String n[]=s.split(" ");
        String res="";
        for(int i=n.length-1;i>=0;i--){
            if(n[i].length()>0){
                if(res.length()>0){
                    res+= " ";
                }
                res+=n[i];
            }
        }
        return res;
    }
}