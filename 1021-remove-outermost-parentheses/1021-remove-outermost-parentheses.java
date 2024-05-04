class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int open=0;
        for(char ch:s.toCharArray()){
            if(ch=='('  && open++ > 0) ans.append(ch);
            if(ch==')' && open-->1) ans.append(ch);
        }
        return ans.toString();
    }
}