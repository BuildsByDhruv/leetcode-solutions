class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo=0,hi=arr.length-1;
        int mid;

        while(lo<=hi)
        {
            mid=lo+(hi-lo)/2;

            int correctno=mid+1;
            int missing=arr[mid]-correctno;

            if(missing >= k)
            {
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return lo+k;
    }
}