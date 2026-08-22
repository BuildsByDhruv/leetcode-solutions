class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,ans=n,sum=0,product=1;
        while(n>0)
        {
            temp=n%10;
            sum+=temp;
            product*=temp;
            n=n/10;
        }
        if(ans%(sum+product)==0) return true;
        else return false;
    }
}