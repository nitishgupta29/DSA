class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        String C=A + A;
        return C.contains(B);
    }
}