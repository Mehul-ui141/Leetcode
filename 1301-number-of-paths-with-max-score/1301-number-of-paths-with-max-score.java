class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int mod=1000000007;
        int n=board.size();
        int[] ns=new int[n + 1];
        int[] nw=new int[n + 1];
        Arrays.fill(ns,-1);
        for(int i=n-1;i>=0;i--){
            int[] cs=new int[n + 1];
            int[] cw=new int[n + 1];
            Arrays.fill(cs,-1);
            for(int j=n-1;j>=0;j--){
                char cell=board.get(i).charAt(j);
                if(cell=='X'){
                    continue;
                }
                if(cell=='S'){
                    cs[j]=0;
                    cw[j]=1;
                    continue;
                }
                int best=Math.max(
                    ns[j],
                    Math.max(cs[j+1],ns[j+1]));
                if(best==-1){
                    continue;
                }
                long ways=0;
                if(ns[j]==best){
                    ways+=nw[j];
                }
                if(cs[j+1]==best){
                    ways+=cw[j+1];
                }
                if(ns[j+1]==best){
                    ways+=nw[j+1];
                }
                int value=(cell=='E')?0:cell-'0';
                cs[j]=best+value;
                cw[j]=(int)(ways%mod);
            }
            ns=cs;
            nw=cw;
        }
        if(ns[0]==-1){
            return new int[]{0,0};
        }
        return new int[]{ns[0],nw[0]};
    }
}