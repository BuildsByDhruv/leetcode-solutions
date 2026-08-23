class Solution {
    public int addDigits(int num) {
        int temp,sum=0; 

        if(num<10) return num;

        while(num>0)
        {
            temp=num%10;
            sum+=temp;
            num=num/10;
        }
        return addDigits(sum);
    }
}