class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length==0) return ans;
        int start=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i]+1) continue;
            else
            {
                if(start==i) ans.add(String.valueOf(nums[i]));
                else ans.add(nums[start]+"->"+nums[i]);

                start=i+1;
            }
        }
        if(start==nums.length-1) ans.add(String.valueOf(nums[start]));
        else ans.add(nums[start]+"->"+nums[nums.length-1]);

        return ans;
    }
}