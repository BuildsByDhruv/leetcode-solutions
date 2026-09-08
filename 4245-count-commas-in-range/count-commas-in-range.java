class Solution {
    public int countCommas(int n) {
        int count=0;
        int digit=0;

        for(int i=0;i<=n;i++)
        {
            int temp=i;
            while(temp>0)
            {
                temp/=10;
                digit++;
            }
            if(digit>3) count++;
            digit=0;
        }
        return count;
    }
}