class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,ct=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int x:nums){
            sum+=x;
            if(map.containsKey(sum-k)){
                ct+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ct;
    }
}