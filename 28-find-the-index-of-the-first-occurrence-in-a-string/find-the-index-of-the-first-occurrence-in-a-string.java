class Solution {
    public int strStr(String haystack, String needle) {
        int lp = 0, rp = 0;

        if (needle.length() > haystack.length())
            return -1;

        while (lp <= haystack.length() - needle.length()) {
            if (haystack.charAt(lp) == needle.charAt(0)) {

                int ans = lp;
                rp = lp;

                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(rp) == needle.charAt(i))
                        rp++;
                    else
                        break;
                }
                if (rp - lp == needle.length())
                    return ans;
            }
            lp++;
        }
        return -1;
    }
}