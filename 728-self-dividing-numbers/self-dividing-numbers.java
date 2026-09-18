class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int i=left;i<=right;i++)
        {
        int temp=i;
        boolean check=true;
            while(temp>0)
            {
                int digit=temp%10;
                if(digit==0) 
                {
                    check=false;
                    break;
                }
                if(i%digit!=0) 
                {
                    check=false;
                    break;
                }
                temp/=10;
            }
            if(check) ans.add(i);
        }
        return ans;
    }
}