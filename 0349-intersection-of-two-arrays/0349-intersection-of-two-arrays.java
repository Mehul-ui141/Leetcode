class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int x=nums1[i];
            set1.add(x);
        }
        for(int i=0;i<nums2.length;i++){
            int x=nums2[i];
            if(set1.contains(x)){
                set2.add(x);
            }
        }
        int ans[]=new int[set2.size()];
        int i=0;
        for(int x:set2){
            ans[i++]=x;
        }
        return ans;
    }
}