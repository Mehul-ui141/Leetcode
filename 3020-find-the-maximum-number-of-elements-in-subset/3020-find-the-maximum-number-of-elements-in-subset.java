class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int one=map.getOrDefault(1,0);
        int ans=one%2==0?one-1:one;
        for(int x:nums){
            if(x==1){
                continue;
            }
            int len=0;
            long curr=x;
            while(curr<=1000000000 && map.getOrDefault((int)curr,0)>=2){
                len+=2;
                curr*=curr;
            }
            if(curr<=1000000000 && map.containsKey((int)curr)){
                len++;
            }
            else{
                len--;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}