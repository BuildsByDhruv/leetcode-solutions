class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) 
        {
            if (c == '(') 
            {
                stack.push(c);
                if (stack.size() > 1) ans.append(c);
            } 
            else 
            {
                if (stack.size() > 1) ans.append(c);
                stack.pop();
            }
        }
        return ans.toString();
    }
}