class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color)return image;
  solve(oldcolor,image,sr,sc,color);
  return image;
    }
    public void solve(int oldcolor,int[][] image, int sr, int sc, int color){
        int m=image.length;
        int n=image[0].length;
        if(sr<0 || sc<0 ||sr>=m ||sc>=n){
            return ;
        }
     if(image[sr][sc]!=oldcolor){
        return ;
     }
        image[sr][sc]=color;
        solve(oldcolor,image,sr-1,sc,color);
        solve(oldcolor,image,sr+1,sc,color);
        solve(oldcolor,image,sr,sc-1,color);
        solve(oldcolor,image,sr,sc+1,color);
    }  
}