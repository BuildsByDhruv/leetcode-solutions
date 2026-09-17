class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("+")) ans.add(ans.get(ans.size()-1)+ans.get(ans.size()-2));
            else if(operations[i].equals("C")) ans.remove(ans.size()-1);
            else if(operations[i].equals("D")) ans.add(2*ans.get(ans.size()-1));
            else ans.add(Integer.parseInt(operations[i]));
        }
        int sum=0;
        for(int i=0;i<ans.size();i++)
        {
            sum+=ans.get(i);
        }
        return sum;
    }
}