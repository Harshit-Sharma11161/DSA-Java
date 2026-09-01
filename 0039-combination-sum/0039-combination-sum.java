class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>>list=new ArrayList<>();
         ArrayList<Integer>temp=new ArrayList<>();
        solve(candidates,0,list,target,temp);
        return list;
    }
    public void  solve(int []candidates,int i,ArrayList<List<Integer>>list,int target,ArrayList<Integer>temp){
        int n=candidates.length;
        if(i==n)return ;
        if(target==0){
            list.add(new ArrayList<>(temp));
            return ;
        }
        if(candidates[i]<=target){
            temp.add(candidates[i]);
            solve(candidates,i,list,target-candidates[i],temp);
            temp.remove(temp.size()-1);
          
        }
        solve(candidates,i+1,list,target,temp);
    }
}