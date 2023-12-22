class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        Map<Character,Integer> m =new HashMap<>();
        int ans=0;
        for(int i=0,j=0 ;i<s.length();i++){
           if(m.containsKey(s.charAt(i))){
               j=Math.max(j,m.get(s.charAt(i))+1);
           }
            m.put(s.charAt(i),i);
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}