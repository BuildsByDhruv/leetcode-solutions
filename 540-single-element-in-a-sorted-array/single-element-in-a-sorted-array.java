class Solution {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];

        int lo=0,hi=nums.length-1;
        int mid;

        while(lo<=hi)

        {
            mid=lo+(hi-lo)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];

            int f=mid,l=mid;

            if(nums[mid-1]==nums[mid]) f=mid-1;
            else l=mid+1;

            int leftcount=f-lo,rightcount=hi-l;

            if(leftcount%2==0) lo=l+1;
            else hi=f-1;
        }
        return -1;
    }
}