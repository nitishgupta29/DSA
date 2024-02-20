class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int i=0;
        for(i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1])
                break;
        }
        if(i==arr.length || i==1)
            return false;
        for(;i<arr.length;i++){
            if(arr[i]>=arr[i-1])
                break;
        }
        return i==arr.length;
    }
}