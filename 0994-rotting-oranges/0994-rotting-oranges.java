class Solution {
    public int orangesRotting(int[][] grid) {
     Queue<int []>q=new ArrayDeque<>();
     int fresh=0;
     int m=grid.length;
     int n=grid[0].length;
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==2){
               q.add(new int []{i,j}); 
            }
        else if(grid[i][j]==1){
            fresh++;
        }
        }
     }
     int time=0;
     int [][] Directions={{-1,0},{1,0},{0,-1},{0,1}};
     while(!q.isEmpty()&& fresh>0){
        int size=q.size();
        for(int i=0;i<size;i++){
            int []curr=q.poll();
            int cr=curr[0];
            int cc=curr[1];
          for(int []dir:Directions){
            int nr=cr+dir[0];
            int nc=cc+dir[1];
            if(nr>=0&& nr<m&&nc>=0&&nc<n&&grid[nr][nc]==1){
                grid[nr][nc]=2;
                fresh--;
                q.offer(new int []{nr,nc});
            }
           
          } 
         

        }
        time++;

     } 
     if(fresh>0){
        return -1;
     }
     return time;  
    }
}