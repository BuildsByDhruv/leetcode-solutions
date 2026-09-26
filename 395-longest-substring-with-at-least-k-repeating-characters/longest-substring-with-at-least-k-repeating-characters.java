class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;

        for(int uniquenum=1;uniquenum<=26;uniquenum++)
        {
            int[] freq = new int[26];
            int i = 0;
            int unique = 0;
            int atLeastK = 0;

            for(int j=0;j<s.length();j++)
            {
                int x = s.charAt(j)-'a';

                if(freq[x]==0) unique++;
                freq[x]++;

                if(freq[x]==k) atLeastK++;

                while(unique>uniquenum)
                {
                    int y = s.charAt(i)-'a';

                    if(freq[y]==k) atLeastK--;
                    freq[y]--;
                    if(freq[y]==0) unique--;
                    i++;
                }
                if(unique==atLeastK) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}