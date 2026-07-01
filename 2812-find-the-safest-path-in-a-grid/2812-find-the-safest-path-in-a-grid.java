class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n=grid.size();
        int[][] dist=new int[n][n];
        for(int[] d:dist){
            Arrays.fill(d,-1);
        }
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid.get(i).get(j)==1){
                    dist[i][j]=0;
                    q.offer(new int[]{i,j});
                }
            }
        }
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            for(int k=0;k<4;k++){
                int nr=cur[0]+dr[k];
                int nc=cur[1]+dc[k];
                if(nr>=0 && nr<n && nc>=0 && nc<n && dist[nr][nc]==-1){
                    dist[nr][nc]=dist[cur[0]][cur[1]]+1;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[2]-a[2]);
        boolean[][] b=new boolean[n][n];
        pq.offer(new int[]{0,0,dist[0][0]});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int r=cur[0],c=cur[1],safe=cur[2];

            if(b[r][c]){
                continue;
            }
            b[r][c]=true;
            if(r==n-1 && c==n-1){
                return safe;
            }
            for(int k=0;k<4;k++){
                int nr=r+dr[k];
                int nc=c+dc[k];
                if(nr>=0 && nr<n && nc>=0 && nc<n && !b[nr][nc]){
                    pq.offer(new int[]{nr,nc,Math.min(safe,dist[nr][nc])});
                }
            }
        }
        return 0;
    }
}