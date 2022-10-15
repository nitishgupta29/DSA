class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private void backtrack(int ind,int[] candidates,int target,List<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)
                break;
            temp.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}