class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,b=0;
        for(int i=0;i<moves.length();i++){
            char x = moves.charAt(i);
            if(x=='L'){
                l++;
            } 
            else if(x=='R'){
                r++;
            } 
            else 
                b++;
        }
        int distance;
        if(l>r){
            distance=l-r;
        } 
        else{
            distance=r-l;
        }
        distance = distance+b;   
        return distance;
    }
}