class Solution {
    public int dominantIndex(int[] nums) {
        int largest=-1,idx=-1;

        for(int i=0;i<nums.length;i++)
        {
            largest=Math.max(nums[i],largest);
        }

        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=largest && 2*nums[j]>largest) return -1;
        }

        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]==largest) idx=k;
        }
        return idx;
    }
}