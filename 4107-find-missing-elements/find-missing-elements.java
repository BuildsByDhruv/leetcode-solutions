class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        int n=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=n)
            {
                ans.add(n);
                n++;
            }
            n++;
        }

        return ans;
    }
}