class Solution {
    public String reverseWords(String s) {
       StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)== ' ')  continue;
            int j=i;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(sb.isEmpty()){
                sb.append(s.substring(i + 1, j + 1));
            }
            else{
                sb.append(' ').append(s.substring(i + 1, j + 1));
            }
        }
        return sb.toString();
    }
}