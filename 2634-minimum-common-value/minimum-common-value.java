class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++)
        {
            int lo=0,hi=nums2.length-1;
            int mid=0;

            while(lo<=hi)
            {
                mid=lo+(hi-lo)/2;

                if(nums2[mid]==nums1[i]) return nums1[i];
                else if(nums2[mid]<nums1[i]) lo=mid+1;
                else hi=mid-1;
            }
        }
        return -1;
    }
}