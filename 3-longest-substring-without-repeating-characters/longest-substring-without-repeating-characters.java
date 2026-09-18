class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last=new int[128];
        Arrays.fill(last,-1);
        int p1=0;
        int max=0;

        for(int p2=0;p2<s.length();p2++)
        {
            char ch=s.charAt(p2);

            if(last[ch]>=p1)
                p1=last[ch]+1;

            last[ch]=p2;
            max=Math.max(max,p2-p1+1);
        }

        return max;
    }
}