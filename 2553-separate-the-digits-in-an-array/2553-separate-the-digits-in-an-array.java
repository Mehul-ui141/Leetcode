class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            while(temp>0){
                total++;
                temp/=10;
            }
        }
        int a[]=new int[total];
        int id=0;
        for(int i=0;i<n;i++){
            String s=String.valueOf(nums[i]);
            for(int j=0;j<s.length();j++){
                a[id++]=s.charAt(j)-'0';
            } 
        }
        return a;
    }
}