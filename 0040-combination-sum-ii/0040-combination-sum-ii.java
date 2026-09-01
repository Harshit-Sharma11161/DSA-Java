class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>>list =new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,list,temp);
        return list;  
    }
    public void solve(int []candidates,int i,int target,ArrayList<List<Integer>>list,ArrayList<Integer>temp){
        int n=candidates.length;
         if(target==0){
            list.add(new ArrayList<>(temp));
            return;
            }
       for(int j=i;j<n;j++){
         if(j>i && candidates[j]==candidates[j-1])continue;
         if(candidates[j]> target)break;
         temp.add(candidates[j]);
         solve(candidates,j+1,target-candidates[j],list,temp);
         temp.remove(temp.size()-1);
         }
    }
}