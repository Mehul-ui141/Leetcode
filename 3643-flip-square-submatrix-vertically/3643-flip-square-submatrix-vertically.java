class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top=x;
        int bot=x+k-1;
        while(top<bot){
            for(int col=y;col<y+k;col++){
                int temp = grid[top][col];
                grid[top][col]=grid[bot][col];
                grid[bot][col]=temp;
            }
            top++;
            bot--;
        }
        return grid;
    }
}