class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int p1=0,p2=nums.length-1;

        while(p1<p2)
        {
            while(p1<p2 && nums[p1]%2==0) p1++;
            while(p1<p2 && nums[p2]%2!=0) p2--;

            if(p1<p2)
            {
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
            }
        }
        return nums;
    }
}