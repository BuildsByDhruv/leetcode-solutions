class Solution {

    public long Sqrt(long x) {
        if (x == 0 || x == 1)
            return x;

        for (long i = 1; i <= x; i++) 
        {
            if (i * i == x)
                return i;

            if (i * i > x)
                return i - 1;
        }

        return 0;
    }

    public int arrangeCoins(long n) {
        return (int)(Sqrt(8*n+1)-1)/2;
    }
}