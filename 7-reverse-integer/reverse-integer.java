class Solution {
    public int reverse(int x) {

        int digit = 0;

        while (x != 0) {

            int temp = x % 10;
            x /= 10;

            if (digit > Integer.MAX_VALUE / 10 ||
                    (digit == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }

            if (digit < Integer.MIN_VALUE / 10 ||
                    (digit == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            digit = digit * 10 + temp;
        }
        return digit;
    }
}