class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
      Queue<Integer>q=new ArrayDeque<>();
      int []color=new int [n];
      Arrays.fill(color,-1);
      for(int i=0;i<n;i++){
        if(color[i]!=-1)continue;
      color[i]=0;
        q.offer(i);
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int nbr:graph[curr]){
                if(color[nbr]==-1){
                    color[nbr]=1-color[curr];
                    q.offer(nbr);
                }
                else if(color[nbr]==color[curr])
                return false;
            }

        }
      }
        return true;
    }
}