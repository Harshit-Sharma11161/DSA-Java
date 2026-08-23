class Solution {
    public int characterReplacement(String s, int target) {
      int []freq=new int [26];
      int k=0 ,maxFreq=0,ans=0;
      for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        maxFreq=Math.max(maxFreq,freq[s.charAt(i)-'A']);
        while((i-k+1)-maxFreq>target){
            freq[s.charAt(k)-'A']--;
            k++;
        }
        ans=Math.max(ans,i-k+1);
      }  
      return ans;
    }
}