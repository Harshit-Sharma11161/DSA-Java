class Solution {
    public int numberOfSubstrings(String s) {
       int []ans={-1,-1,-1};
       int count=0;
       for(int i=0;i<s.length();i++){
        ans[s.charAt(i)-'a']=i;
      if(ans[0]!=-1 && ans[1]!=-1&& ans[2]!=-1 ){
        count+=1+Math.min(ans[0],Math.min(ans[1],ans[2]));
      }
       }
       return count; 
    }
}