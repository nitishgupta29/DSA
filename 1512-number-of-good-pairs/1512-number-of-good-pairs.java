class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> m=new HashMap<>();
        int ans=0;
        for(int num : nums){
            ans+=m.getOrDefault(num,0);
            m.put(num,m.getOrDefault(num,0)+1);
        }
        return ans;
    }
}