class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count=0;
        int p1=0,p2=nums.length-1;

        while(p1<p2)
        {
            if(nums[p1]+nums[p2]<=upper)
            {
                count+=p2-p1;
                p1++;
            }
            else p2--;
        }
        p1=0;
        p2=nums.length-1;

        while(p1<p2)
        {
            if(nums[p1]+nums[p2]<lower)
            {
                count-=p2-p1;
                p1++;
            }
            else p2--;
        }
        return count;
    }
}