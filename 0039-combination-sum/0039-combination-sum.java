class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> ans=new ArrayList<>();
        rec(0,n,candidates,ans,new ArrayList<>(),target);
        return ans;
    }
   public void rec(int i,int n,int[] candidates,List<List<Integer>> ans,List<Integer> temp,int target){
       if(i==n){
           if(target==0){
               ans.add(new ArrayList<>(temp));
           }
           return ;
       }
       if(target>=candidates[i]){
            temp.add(candidates[i]);
           rec(i,n,candidates,ans,temp,target-candidates[i]);
           temp.remove(temp.size()-1);
           
       }
       rec(i+1,n,candidates,ans,temp,target);
   }
}