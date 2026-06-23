class Solution {
    public int[][] flipAndInvertImage(int[][] image){
        for(int[] x: image){
            reverse(x);
            flip(x);
        }
        return image;
    }
public void reverse(int[] x){
    int st=0, end=x.length-1;
    while(st<=end){
        int temp=x[st];
        x[st]=x[end];
        x[end]=temp;
        st++;
        end--;
    }
}
public void flip(int[] x){
    for(int i=0;i<x.length;i++){
        if(x[i] == 0){
            x[i] = 1;
        }
        else{
            x[i] = 0;            
        }
    }
}
}
