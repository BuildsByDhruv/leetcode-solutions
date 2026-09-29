class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans=new String[n];
        int[] arr=score.clone();
        Arrays.sort(arr);

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(score[i]==arr[j])
                {
                    int rank=n-j;

                    if(rank==1) ans[i]="Gold Medal";
                    else if(rank==2) ans[i]="Silver Medal";
                    else if(rank==3) ans[i]="Bronze Medal";
                    else ans[i]=String.valueOf(rank);
                }
            }
        }
        return ans;
    }
}