class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> ans=new ArrayList<>();
        for(int[] i:intervals){
            if(newInterval == null || i[1] < newInterval[0]){
                ans.add(i);
            }
            else if(i[0]>newInterval[1]){
                ans.add(newInterval);
                ans.add(i);
                newInterval=null;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],i[0]);
                newInterval[1]=Math.max(newInterval[1],i[1]);
            }
        }
        if(newInterval != null)
            ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}