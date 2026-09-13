class Solution {
    public int maxDistance(int[][] grid) {
      int n=grid.length;
      int land=0;
      int water=0;
      Queue<int []>q=new ArrayDeque<>();
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
    if(grid[i][j]==1){
        land++;
        grid[i][j]=0;
q.add(new int []{i,j});
    }
    else{
        water++;
        grid[i][j]=-1;
    }
        }
      }
      if(water==0 || land==0)return -1;
      int [][]directions={
        {-1,0},{1,0},{0,-1},{0,1}
      } ;
      while(!q.isEmpty()){
        int []curr=q.poll();
        int r=curr[0];
        int c=curr[1];
        for(int []dir:directions){
            int nr=r+dir[0];
            int nc=c+dir[1];
            if(nr>=0 && nr<n && nc>=0 && nc<n && grid[nr][nc]==-1){
                grid[nr][nc]=grid[r][c]+1;
                q.add(new int[]{nr,nc});
            }
        }
      } 
      int max=findmax(grid);
      return max;
    }
    public int findmax(int[][]grid){
        int n=grid.length;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(m<grid[i][j]){
                    m=grid[i][j];
                }
            }
        }
        return m;
    }
}
