class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3) return nums[nums.length-1];

        int max = nums[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int count=1;

        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==max) continue;
            max2=Math.max(max2,nums[j]);
        }

        if(max2==Integer.MIN_VALUE) return max;
        count=2;

        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==max || nums[k]==max2) continue;
            max3=Math.max(max3,nums[k]);
            count=3;
        }

        if(count==2) return max;

        return max3;
    }
}