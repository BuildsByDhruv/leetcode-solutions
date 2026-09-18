class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        for(int i=0;i<words.length;i++)
        {
            String word=words[i].toLowerCase();
            int row=0;

            if(row1.indexOf(word.charAt(0))!=-1) row=1;
            else if(row2.indexOf(word.charAt(0))!=-1) row=2;
            else row=3;

            boolean check=true;

            for(int j=0;j<word.length();j++)
            {
                if(row==1 && row1.indexOf(word.charAt(j))==-1) check=false;
                else if(row==2 && row2.indexOf(word.charAt(j))==-1) check=false;
                else if(row==3 && row3.indexOf(word.charAt(j))==-1) check=false;
            }
            if(check) ans.add(words[i]);
        }
        return ans.toArray(new String[0]);
    }
}