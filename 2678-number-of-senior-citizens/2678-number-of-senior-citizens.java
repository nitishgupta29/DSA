class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(String s:details){
            int a=s.charAt(11)-'0';
            int b=s.charAt(12)-'0';
            int age=a*10 + b;
            if(age>60){
                ans++;
            }
        }
        return ans;
    }
}