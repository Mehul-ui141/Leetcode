class Solution {
    public int maxArea(int[] arr) 
    {
        int e=0;
        int f=arr.length-1;
        int max=0;
        int tmax;
        while(e<f)
        {
            tmax=Math.min(arr[e],arr[f])*(f-e);
            if(tmax>max)
            {
                max=tmax;
                
            }
            if(arr[e]<arr[f])
            e=e+1;
            else
            f=f-1;
        }
        return max;
        
    }
}