class Solution {
    public int maxJump(int[] stones) {
       int cost=stones[1]-stones[0];
       for(int i=2;i<stones.length;i++){
        cost=Math.max(cost,stones[i]-stones[i-2]);
       } 
       return cost;
    }
}