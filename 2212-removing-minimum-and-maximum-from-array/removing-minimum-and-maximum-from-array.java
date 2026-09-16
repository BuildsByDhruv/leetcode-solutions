class Solution {
    public int minimumDeletions(int[] nums) {
        int MaxIdx=-1,MinIdx=-1;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                MaxIdx=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                MinIdx=i;
            }
        }

        int left=Math.min(MinIdx,MaxIdx);
        int right=Math.max(MinIdx,MaxIdx);

        int c1=right+1;
        int c2=nums.length-left;
        int c3=left+1+nums.length-right;

        return Math.min(c1,Math.min(c2,c3));
    }
}