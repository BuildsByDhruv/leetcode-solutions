class Solution {
    public boolean isSubsequence(String s,String t) {
        int p1=0,p2=0;

        for(p2=0;p2<t.length()&&p1<s.length();p2++)
        {
            if(s.charAt(p1)==t.charAt(p2)) p1++;
        }
        return p1==s.length();
    }
}