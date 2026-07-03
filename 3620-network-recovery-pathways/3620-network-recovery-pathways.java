class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n=online.length;
        List<List<int[]>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        long maxCost=0;
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int cost=edge[2];
            if (online[u] && online[v]){
                graph.get(u).add(new int[]{v,cost});
                maxCost=Math.max(maxCost,cost);
            }
        }
        if(!online[0] || !online[n - 1]) return -1;
        long l=0;
        long r=maxCost;
        long ans=-1;
        while(l<=r){
            long m=l+(r-l)/2;
            if(isValid(n,graph,m,k)){
                ans=m;        
                l=m+1;
            } 
            else{
                r=m-1;   
            }
        }
        return (int) ans;
    }
    public boolean isValid(int n, List<List<int[]>> graph, long minThreshold, long k){
        long[] dist=new long[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        PriorityQueue<long[]> pq=new PriorityQueue<>((a, b) -> Long.compare(a[1],b[1]));
        dist[0]=0;
        pq.offer(new long[]{0, 0});
        while(!pq.isEmpty()){
            long[] curr=pq.poll();
            int u=(int) curr[0];
            long currentCost=curr[1];
            if (u==n-1){
                return currentCost<=k;
            }
            if(currentCost>dist[u]) continue;
            for(int[] edge : graph.get(u)){
                int v=edge[0];
                int edgeCost=edge[1];
                if (edgeCost>=minThreshold) {
                    if(currentCost+edgeCost<dist[v]){
                        dist[v]=currentCost+edgeCost;
                        pq.offer(new long[]{v, dist[v]});
                    }
                }
            }
        }
        return false;
    }
}