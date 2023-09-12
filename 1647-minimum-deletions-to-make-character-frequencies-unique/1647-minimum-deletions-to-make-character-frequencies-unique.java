class Solution {
    public int minDeletions(String s) {
        int[] charCount=new int[26];
        for(char ch : s.toCharArray()){
            charCount[ ch - 'a'] ++;
        }
        int deletion=0;
        HashSet<Integer> set = new HashSet<>();
        for(int val:charCount){
            while(val!=0 && set.contains(val)){
                val--;
                deletion++;
            }
            set.add(val);
        }
        return deletion;
    }
}