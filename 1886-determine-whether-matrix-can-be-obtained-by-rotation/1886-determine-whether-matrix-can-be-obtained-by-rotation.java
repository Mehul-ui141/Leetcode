class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0; k<4; k++){
            if(check(mat, target)) return true;
            mat = rotate(mat);
        }
        return false;
    }

    boolean check(int[][] a, int[][] b){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

    int[][] rotate(int[][] mat){
        int n = mat.length;
        int[][] res = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                res[j][n-i-1] = mat[i][j];
            }
        }
        return res;
    }
}