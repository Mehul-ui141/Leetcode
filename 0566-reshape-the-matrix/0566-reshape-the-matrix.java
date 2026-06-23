class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int[][] mat2=new int[r][c];
        int id=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            mat2[i][j]=mat[id/n][id%n];
                id++;
            }
        }
        return mat2;
    }
}