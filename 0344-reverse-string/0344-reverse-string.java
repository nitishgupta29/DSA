class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        char m=' ';
        while(i<j){
            m=s[i];
            s[i]=s[j];
            s[j]=m;
            i++;
            j--;
        }
    }
}