class Solution {
    public int[][] highestPeak(int[][] isWater) {
      int m=isWater.length;
      int n=isWater[0].length;
      int[][] height= new int [m][n];
      Queue<int []>q=new ArrayDeque<>();
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(isWater[i][j]==1){
             height[i][j]=0;
             q.add(new int []{i,j});
            }
            else{
                height[i][j]=-1;
            }
        }
      }  
      int [][]directions={
        {-1,0},{1,0},{0,-1},{0,1}
        };
        while(!q.isEmpty()){
            int []curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int []dir:directions){
                int nr=r+dir[0];
                int nc=c+dir[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && height[nr][nc]==-1){
                    height[nr][nc]=height[r][c]+1;
                    q.add(new int []{nr,nc});
                }
            }
        }
        return height;
    }
}