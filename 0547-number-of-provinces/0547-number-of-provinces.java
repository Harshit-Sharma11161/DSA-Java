class Solution { 
    public int findCircleNum(int[][] isConnected) {
      int n=isConnected.length;
      int k=0;
      boolean visited[]=new boolean [n];
      ArrayList<List<Integer>>adj=new ArrayList<>();
      for (int i = 0; i < n; i++) {
    adj.add(new ArrayList<>());
}
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
if(isConnected[i][j]==1 && i!=j){
    adj.get(i).add(j);
}
        } 
      }    for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                k++;
                solve(i, visited, adj);
            }
        }
        return k;
    }
    public void solve(int s,boolean visited[], ArrayList<List<Integer>>adj){
        visited[s]=true;
        for(int nbr:adj.get(s)){
            if(!visited[nbr]){
                solve(nbr,visited,adj);
            }
        }
    }
}