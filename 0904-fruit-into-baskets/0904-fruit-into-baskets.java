class Solution {
    public int totalFruit(int[] arr) {
   HashMap<Integer,Integer>map=new HashMap<>(); 
   int k=0;
   int sum=0;   
   int maxSum=0;
    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        if(map.size()>2){
           map.put(arr[k],map.getOrDefault(arr[k],0)-1);
           if(map.get(arr[k])==0){
            map.remove(arr[k]);
           }
           k++;
        }
        sum=i-k+1;
        maxSum=Math.max(maxSum,sum);
    }
    return maxSum;
    }
}