class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            List<Integer> arr2 = new ArrayList<>();
            while(temp>0)
            {
                int digits=temp%10;
                temp/=10;
                arr2.add(digits);
            }
            for(int j=arr2.size()-1;j>=0;j--)
            {
                ans.add(arr2.get(j));
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
    }
}