class Solution {
    public String toHex(int num) {
        String ans="";
        if(num==0) return "0";

        while(num!=0)
        {
            int temp=num&15;
            if(temp==10) ans+="a";
            else if(temp==11) ans+="b";
            else if(temp==12) ans+="c";
            else if(temp==13) ans+="d";
            else if(temp==14) ans+="e";
            else if(temp==15) ans+="f";
            else ans+=temp;
            num>>>=4;
        }

        String rev="";
        
        for(int i=ans.length()-1;i>=0;i--)
        {
            rev+=ans.charAt(i);
        }
        return rev;
    }
}