class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr=new int[nums1.length+nums2.length];

        int p1=0,p2=0,p3=0;

        while (p1<nums1.length && p2<nums2.length)
        {
            if (nums1[p1]<nums2[p2]) arr[p3++]=nums1[p1++];
            else arr[p3++]=nums2[p2++];
        }

        while (p1<nums1.length)
        {
            arr[p3++]=nums1[p1++];
        }

        while (p2<nums2.length)
        {
            arr[p3++]=nums2[p2++];
        }

        int lo=0;
        int hi=arr.length-1;
        int mid=lo+(hi-lo)/2;

        if (arr.length%2==1)
            return arr[mid];

        return (arr[mid]+arr[mid+1])/2.0;
    }
}