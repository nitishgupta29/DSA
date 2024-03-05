class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i]) && (m.get(nums[i])>=1))
                return true;
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        return false;
    }
}