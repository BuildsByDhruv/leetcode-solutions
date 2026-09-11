class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int lo=0,hi=nums.length;

        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            int count=0;

            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>=mid) count++;
            }

            if(count==mid) return mid;
            else if(count>mid) lo=mid+1;
            else hi=mid-1;
        }

        return -1;
    }
}