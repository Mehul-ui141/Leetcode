class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums){
            map.put(num+1,map.getOrDefault(num,0)+1);
            map.put(num,map.getOrDefault(num-1,0)+1);
            ans=Math.max(ans,Math.max(map.get(num),map.get(num+1)));
        }
        return ans;
    }
}