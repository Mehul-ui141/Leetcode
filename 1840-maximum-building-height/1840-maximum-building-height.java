class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> r=new ArrayList<>();
        r.add(new int[]{1,0});
        for(int[] x:restrictions){
            r.add(x);
        }
        r.add(new int[]{n,n-1});
        r.sort((a,b)->a[0]-b[0]);
        for(int i=1;i<r.size();i++){
            r.get(i)[1]=Math.min(r.get(i)[1],r.get(i-1)[1]+r.get(i)[0]-r.get(i-1)[0]);
        }
        for(int i=r.size()-2;i>=0;i--){
            r.get(i)[1]=Math.min(r.get(i)[1],r.get(i+1)[1]+r.get(i+1)[0]-r.get(i)[0]);
        }
        int ans=0;
        for(int i=1;i<r.size();i++){
            int x=r.get(i-1)[0];
            int h1=r.get(i-1)[1];
            int y=r.get(i)[0];
            int h2=r.get(i)[1];
            ans=Math.max(ans,(h1+h2+y-x)/2);
        }
        return ans;
    }
}