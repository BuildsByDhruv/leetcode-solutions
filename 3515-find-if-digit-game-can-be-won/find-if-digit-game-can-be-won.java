class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0,bob=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) alice+=nums[i];
            else bob+=nums[i];
        }
        if(alice>bob) return true;

        alice=0;bob=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) bob+=nums[i];
            else alice+=nums[i];
        }
        if(alice>bob) return true;
        return false;
    }
}