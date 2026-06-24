class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int v1=0,v2=0,ct1=0,ct2=0;
        for(int x:nums){
            if(x==v1){
                ct1++;
            }
            else if(x==v2){
                ct2++;
            }
            else if(ct1==0){
                v1=x;
                ct1=1;
            }
            else if(ct2==0){
                v2=x;
                ct2=1;
            }
            else{
                ct1--;
                ct2--;
            }
        }
        ct1=0;
        ct2=0;
        for(int x:nums){
            if(x==v1){
                ct1++;
            }
            else if(x==v2){
                ct2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(ct1>nums.length/3){
            ans.add(v1);
        }
        if(ct2>nums.length/3){
            ans.add(v2);
        }
        return ans;
    }
}