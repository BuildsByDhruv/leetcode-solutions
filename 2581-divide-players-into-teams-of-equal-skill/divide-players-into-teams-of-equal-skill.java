class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int p1=0,p2=skill.length-1;
        long sum=0;

        for(int ele:skill) sum+=ele;

        long avg=2*sum/skill.length;
        long ans=0;

        while(p1<p2)
        {
            if(skill[p1]+skill[p2]==avg)
            {
                ans+=(long)skill[p1]*skill[p2];
                p1++;
                p2--;
            }
            else return -1;
        }
        return ans;
    }
}