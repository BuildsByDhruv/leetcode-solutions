class Solution {
    public char findTheDifference(String s, String t) {
        char[] s_ans = s.toCharArray();
        char[] t_ans = t.toCharArray();
        Arrays.sort(s_ans);
        Arrays.sort(t_ans);

        for(int i=0;i<s_ans.length;i++)
        {
            if(s_ans[i]!=t_ans[i]) return t_ans[i];
        }
        return t_ans[t_ans.length-1];
    }
}