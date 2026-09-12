class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        for(int i=1;i<=rowIndex;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);

            for(int j=1;j<i;j++)
            {
                temp.add(ans.get(j-1)+ans.get(j));
            }
            temp.add(1);
            ans=temp;
        }
        return ans;
    }
}