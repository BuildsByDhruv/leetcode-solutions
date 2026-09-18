class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long ans=0;
        long place=10;

        while(true)
        {
            long temp=n;
            long sum=0;

            while(temp>0)
            {
                long digit=temp%10;
                sum+=digit;
                temp/=10;
            }
            if(sum<=target) return ans;

            long add=place-n%place;
            n+=add;
            ans+=add;
            place*=10;
        }
    }
}