class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
      solve(0,nums,temp,result);
      return result;  
    }
    public void solve(int idx,int[] nums, ArrayList<Integer>temp,ArrayList<List<Integer>>result){
        if(idx==nums.length){
            result.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            temp.add(nums[idx]);
            solve(idx+1,nums,temp,result);
            temp.remove(temp.size()-1);
            swap(nums,idx,i);
        }
    }
    public void swap(int []ans,int i,int j){
        int temp=ans[i];
        ans[i]=ans[j];
        ans[j]=temp;
    }
}