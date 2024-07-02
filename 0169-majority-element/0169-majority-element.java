class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> ma:m.entrySet()){
            if(ma.getValue()>(n / 2)){
                return ma.getKey();
            }
        }
        return -1;
    }
}