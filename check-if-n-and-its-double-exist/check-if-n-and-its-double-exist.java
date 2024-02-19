class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> m =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(((arr[i]%2 == 0) && m.containsKey(arr[i]/2)) || m.containsKey(arr[i]*2))
                return true;
            else{
                m.put(arr[i],m.getOrDefault(arr[i],1));
            }    
        }
        return false;
    }
}