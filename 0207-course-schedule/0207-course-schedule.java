class Solution {
    public boolean canFinish(int V, int[][] edges) {
        ArrayList<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int   []state=new int [V];
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        for(int i=0;i<V;i++){
            if(state[i]==0){
                if(dfs(i,state,adj)){
                 return false;  
                }
            }
        }
        return true;
    }
  public boolean  dfs(int i,int []state,ArrayList<List<Integer>>adj){
      state[i]=1;
      for(int nbr:adj.get(i)){
          if(state[nbr]==0){
              if(dfs(nbr,state,adj))
              return true;
          }
          else if(state[nbr]==1){
            return true;
          }
          
      }
      state[i]=2;
      return false;
}
}