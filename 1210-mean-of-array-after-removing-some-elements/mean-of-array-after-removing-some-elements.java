class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        int remove=arr.length/20;

        for(int i=remove;i<arr.length-remove;i++)
        {
            sum+=arr[i];
        }
        return (double)sum/(arr.length-2*remove);
    }
}