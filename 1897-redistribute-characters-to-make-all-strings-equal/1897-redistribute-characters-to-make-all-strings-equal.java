class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character,Integer> m=new HashMap<>();
        for(String w:words){
            for(char c:w.toCharArray()){
                m.put(c,m.getOrDefault(c,0)+1);
            }
        }
        int n=words.length;
        for(Character c:m.keySet()){
            int val=m.get(c);
            if(val%n!=0){
                return false;
            }
        }
        return true;
    }
}