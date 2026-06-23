class Solution {
    public int[][] generateMatrix(int n) {
        int r1 = 0, r2 = n - 1;
        int c1 = 0, c2 = n - 1;
        int[][] a = new int[n][n];
        int val = 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++)
                a[r1][c] = val++;
            for (int r = r1 + 1; r <= r2; r++)
                a[r][c2] = val++;
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--)
                    a[r2][c] = val++;
                for (int r = r2 - 1; r > r1; r--)
                    a[r][c1] = val++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return a;
    }
}