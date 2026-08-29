class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] res=nums.clone();
        Arrays.sort(res);
        List<List<Integer>> group=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        int id=-1;
        for(int i=0;i<res.length;i++){
            if(i==0 || res[i]-res[i-1]>limit){
                group.add(new ArrayList<>());
                id++;
            }
            group.get(id).add(res[i]);
            map.put(res[i],id);
        }
        int[] n=new int[group.size()];
        for(int i=0;i<res.length;i++){
            int curr=map.get(nums[i]);
            res[i]=group.get(curr).get(n[curr]);
            n[curr]++;
        }
        return res;
    }
}