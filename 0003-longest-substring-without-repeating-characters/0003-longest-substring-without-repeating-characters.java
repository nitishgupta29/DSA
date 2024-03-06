class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        Map<Character,Integer> m =new HashMap<>();
        int ans=0;
        int i=0,j=0;
        while(j<s.length()){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            if(m.size()==j-i+1){
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else if(m.size()<j-i+1){
                while(m.size() < j - i + 1){
                    m.put(s.charAt(i), m.get(s.charAt(i)) - 1);
                    if(m.get(s.charAt(i)) == 0) m.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}