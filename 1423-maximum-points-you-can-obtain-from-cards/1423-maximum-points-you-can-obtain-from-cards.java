class Solution {
    public int maxScore(int[] cardPoints, int k) {
      int left=0;
      int sum=0;int max=0;
      for(int i=0;i<k;i++){
        sum+=cardPoints[i];
      }
      max=sum;
      int right=cardPoints.length-1;
      for(int i=k-1;i>=0;i--){
        sum-=cardPoints[i];
        sum+=cardPoints[right];
        right--; 
       max=Math.max(max,sum); 
      }
      return max;
    }
}