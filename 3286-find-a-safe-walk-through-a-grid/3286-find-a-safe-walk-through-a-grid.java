class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size(),n=grid.get(0).size();
        int[][] best=new int[m][n];
        for(int[] x:best){
            Arrays.fill(x,-1);
        }
        Queue<int[]> q=new LinkedList<>();
        int start=health-grid.get(0).get(0);
        if(start<=0){
            return false;
        }
        q.offer(new int[]{0,0,start});
        best[0][0]=start;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0];
            int c=cur[1];
            int h=cur[2];
            if(r==m-1 && c==n-1){
                return true;
            }
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr<0 || nr>=m || nc<0 || nc>=n){
                    continue;
                }
                int nh=h-grid.get(nr).get(nc);
                if(nh<=0){
                    continue;
                }
                if(nh>best[nr][nc]){
                    best[nr][nc]=nh;
                    q.offer(new int[]{nr,nc,nh});
                }
            }
        }
        return false;
    }
}