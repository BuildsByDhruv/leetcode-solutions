class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                if(Math.abs(i-j)<=k && nums[j]==key)
                {
                ans.add(i); 
                break;
                } 
            }
        }
        return ans;
    }
}