class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++) 
        {
            int lo=0,hi=arr.length-1;
            int target=arr[i]*2;

            while (lo<=hi) 
            {
                int mid=lo+(hi-lo)/2;

                if (arr[mid]<target)lo=mid+1;
                else if (arr[mid]>target)  hi=mid-1;
                else 
                {
                    if (mid!=i) return true;

                    if (mid+1<arr.length && arr[mid+1] == target) return true;

                    if (mid-1>=0 && arr[mid-1] == target) return true;

                    break;
                }
            }
        }
        return false;
    }
}