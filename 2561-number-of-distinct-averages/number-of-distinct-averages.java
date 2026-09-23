class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Double> ans=new ArrayList<>();
        int p1=0,p2=nums.length-1;

        while(p1<p2)
        {
            double avg=(nums[p1]+nums[p2])/2.0;

            if(!ans.contains(avg)) ans.add(avg);

            p1++;
            p2--;
        }
        return ans.size();
    }
}