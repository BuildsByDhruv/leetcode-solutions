class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j]) ans.add(arr1[j]);
            }
        }
        
        List<Integer> left = new ArrayList<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            boolean found=false;
            
            for(int j=0;j<ans.size();j++)
            {
                if(arr1[i]==ans.get(j)) 
                {
                    found=true;
                    break;
                }
            }
        if(found==false) left.add(arr1[i]);
        }
        
        Collections.sort(left);
        
        ans.addAll(left);
        
        int[] arr_ans = new int[ans.size()];
        
        for(int k=0; k<ans.size();k++)
        {
            arr_ans[k]=ans.get(k);
        }
        return arr_ans;
    }
}