class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length+1];
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            alt[i+1]=sum;
        }
        for(int i=0;i<alt.length;i++)
        {
            max=Math.max(max,alt[i]);
        }
        return max;
    }
}