class Solution {
    public int countEven(int num) {
        int count=0;

        for(int i=1;i<=num;i++)
        {
            int temp=i;
            int digit=0;
            while(temp>0)
            {
                digit+=temp% 10;
                temp/=10;
            }
            if(digit%2==0) count++;
        }
        return count;
    }
}