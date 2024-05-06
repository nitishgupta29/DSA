class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1=new int[200];
        int[] map2=new int[200];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])
                return false;
            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}




//The i+1 thingy is there so that we don't compare chars that are at 0's positions in strings with 0's in int[] arrays.