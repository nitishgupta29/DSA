class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(m.containsKey(c)){
                return new int[]{i,m.get(c)};
            }
            m.put(nums[i],i);
        }
        return new int[]{};
    }
}