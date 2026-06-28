class Solution {
    public int maximumLength(int[] nums) {
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
            max=Math.max(max,x);
        }
        int ans=map.containsKey(1)?map.get(1)-(map.get(1)%2==0?1:0):1;
        for(int x:nums){
            if(x==1){
                continue;
            }
            int len=0;
            long cur=x;
            while(cur<=max && map.containsKey((int)cur) && map.get((int)cur)>=2){
                len+=2;
                cur*=cur;
            }
            ans=Math.max(ans,len+(map.containsKey((int)cur)?1:-1));
        }
        return ans;
    }
}