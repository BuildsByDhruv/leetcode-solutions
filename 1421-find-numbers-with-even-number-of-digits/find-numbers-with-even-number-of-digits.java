class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            int countdigit=0;
            int temp=nums[i];
            while(temp>0)
            {
                int digit=temp%10;
                countdigit++;
                temp/=10;
            }
            if(countdigit%2==0) count++;
        }
        return count;
    }
}