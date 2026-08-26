class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;

        while (i>=0 && nums[i]>=nums[i+1]) i--;

        if (i>=0) 
        {
            int j=nums.length-1;

            while (nums[j]<=nums[i]) j--;

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        int lp=i+1;
        int rp=nums.length-1;

        while (lp<rp) 
        {
            int temp=nums[lp];
            nums[lp]=nums[rp];
            nums[rp]=temp;

            lp++;
            rp--;
        }
    }
}