class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int[] first=new int[26];
        int[] last=new int[26];

        for(int i=0;i<26;i++)
        {
            first[i]=-1;
        }

        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-'a';
            if(first[c]==-1) first[c]=i;
            last[c]=i;
        }
        List<String> ans=new ArrayList<>();
        int past=-1;

        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i)-'a';

            if(first[c]!=i) continue;

            int left=first[c];
            int right=last[c];
            boolean valid=true;

            for(int j=left;j<=right;j++)
            {
                int x=s.charAt(j)-'a';

                if(first[x]<left)
                {
                    valid=false;
                    break;
                }

                right=Math.max(right,last[x]);
            }
            if(valid)
            {
                if(left>past)
                {
                    ans.add(s.substring(left,right+1));
                    past=right;
                }
                else
                {
                    ans.set(ans.size()-1,s.substring(left,right+1));
                    past=right;
                }
            }
        }
        return ans;
    }
}