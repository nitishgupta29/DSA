class Solution {
    public void duplicateZeros(int[] arr) {
       int dups=0;
       int n=arr.length;
       for(int i=0;i<n-dups;i++){
           if(arr[i]==0){
               if(i==n-dups-1){
                   arr[n-1]=0;
                   n--;
                   break;
               }
               dups++;
           }
       }
       int last=n-dups-1;
       for(int i=last;i>=0;i--){
           if(arr[i]==0){
              arr[i + dups] = 0;
              dups--;
              arr[i + dups] = 0;
           }else {
               arr[i+dups]=arr[i];
           }
       }
    }
}