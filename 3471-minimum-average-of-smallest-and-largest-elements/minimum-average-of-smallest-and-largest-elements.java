class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Double> ans=new ArrayList<>();
        int p1=0,p2=nums.length-1;
        double min=Integer.MAX_VALUE;

        while(p1<p2)
        {
            double avg=(nums[p1]+nums[p2])/2.0;

            if(!ans.contains(avg)) ans.add(avg);

            p1++;
            p2--;
        }

        for(double ele:ans) min=Math.min(min,ele);
        return min;
    }
}