class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int p1=0;
        int sum=0;
        int min=nums.length+1;

        for(int p2=0;p2<nums.length;p2++)
        {
            sum+=nums[p2];

            while(sum>=target)
            {
                min=Math.min(min,p2-p1+1);
                sum-=nums[p1];
                p1++;
            }
        }
        if(min==nums.length+1) return 0;
        return min;
    }
}