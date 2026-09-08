class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>>list=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        solve(1,k,n,temp,list);
        return list; 
    }
    public void solve(int start,int k,int n,ArrayList<Integer>temp,ArrayList<List<Integer>>list){
        if(k==0){
            if(n==0){
                list.add(new ArrayList<>(temp));
            }
            return ;
        }
        for(int i=start;i<=9;i++){
            temp.add(i);
            solve(i+1,k-1,n-i,temp,list);
            temp.remove(temp.size()-1);
        }
    }
}