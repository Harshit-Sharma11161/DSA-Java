class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
      int[] state=new int [n]; 
      ArrayList<Integer>ans=new ArrayList<>(); 
      for(int i=0;i<n;i++){
            if(dfs(i,graph,state)){
                ans.add(i);
        }
      }
      return ans;
    }
    public boolean dfs(int i,int[][] graph,int []state){
        if(state[i]==1)return false;
        if(state[i]==2)return true;
        state[i]=1;
        for(int nbr:graph[i]){
              if(!dfs(nbr,graph,state))
              return false;
        }
        state[i]=2;
        return true;
    }
}