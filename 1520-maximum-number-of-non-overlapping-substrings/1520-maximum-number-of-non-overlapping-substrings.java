class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();
        int[] f=new int[26];
        int[] last=new int[26];
        Arrays.fill(f, n);
        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-'a';
            if(f[ch]==n){
                f[ch]=i;
            }
            last[ch]=i;
        }
        List<int[]> intervals=new ArrayList<>();
        for(int ch=0;ch<26;ch++){
            if(last[ch]==-1){
                continue;
            }
            int start=f[ch];
            int end=last[ch];
            boolean valid=true;
            for(int i=start;i<=end;i++){
                int current=s.charAt(i)-'a';
                if(f[current]<start){
                    valid=false;
                    break;
                }
                end=Math.max(end,last[current]);
            }
            if(valid){
                intervals.add(new int[]{start,end});
            }
        }
        intervals.sort((a,b)->{
            if(a[1]!=b[1]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[1]-a[0],b[1]-b[0]);
        });
        List<String> ans=new ArrayList<>();
        int prev=-1;
        for(int[] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            if(start>prev){
                ans.add(s.substring(start,end+1));
                prev=end;
            }
        }
        return ans;
    }
}