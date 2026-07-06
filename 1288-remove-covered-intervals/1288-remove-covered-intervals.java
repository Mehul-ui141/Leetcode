class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int ct=0;
        int maxEnd=0;
        for(int[] interval:intervals){
            if(interval[1]>maxEnd){
                ct++;
                maxEnd=interval[1];
            }
        }
        return ct;
    }
}