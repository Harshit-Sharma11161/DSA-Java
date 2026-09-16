class Solution {
    public int lengthOfLongestSubstring(String s) {
      char []freq=new char[128];
      int left=0;
      int max=0;
      for(int right=0;right<s.length();right++){
        int ch=s.charAt(right);
        freq[ch]++;
        while(freq[ch]>1){
            freq[s.charAt(left)]--;
            left++;
        }
        max=Math.max(max,right-left+1);
      } 
      return max;  
    }
}