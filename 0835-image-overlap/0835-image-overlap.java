class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        List<int[]> lst1=new ArrayList<>();
        List<int[]> lst2=new ArrayList<>();
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                if(img1[i][j]==1){
                    lst1.add(new int[]{i, j});
                }
                if(img2[i][j] == 1){
                    lst2.add(new int[]{i,j});
                }
            }
        }
        int[][] st=new int[2*n][2*n];
        int best=0;
        for(int[] a:lst1){
            for(int[] b:lst2){
                int dx=b[0]-a[0]+n;
                int dy=b[1]-a[1]+n;
                best=Math.max(best,++st[dx][dy]);
            }
        }
        return best;
    }
}