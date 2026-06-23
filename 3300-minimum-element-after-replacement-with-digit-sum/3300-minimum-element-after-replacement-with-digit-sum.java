class Solution {
    public int minElement(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int x:nums){
            int y=0;
            while(x>0){
                y+=x%10;
                x/=10;
            }
            m=Math.min(m,y);
        }
        return m;
    }
}