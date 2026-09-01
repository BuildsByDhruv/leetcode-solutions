class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int i=0,j=0;        
        while(i<nums.length)
        {
            j=0;
            while(j<nums.length)
            {
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference) return new int[]{i,j};
                j++;
            }
            i++;
        }
        return new int[]{-1,-1};
    }
}