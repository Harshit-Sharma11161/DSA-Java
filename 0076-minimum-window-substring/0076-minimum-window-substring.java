class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
    int [] freq=new int [128];
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        freq[ch]++;
    }
    int left=0;
    int count=0;
    int start=0;
    int minlength=Integer.MAX_VALUE;
    for(int right=0;right<s.length();right++){
        char ch=s.charAt(right);
        if(freq[ch]>0){
          count++;
        }
        freq[ch]--;
    while(count==t.length()){
        if(right-left+1<minlength){
            minlength=right-left+1;
            start=left;
        }
        char c=s.charAt(left);
        freq[c]++;
        if(freq[c]>0)
        count--;
     left++;

    }
    }
    if(minlength==Integer.MAX_VALUE)return "";
    return s.substring(start,start+minlength);
    }
}