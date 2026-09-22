class Solution {
    public boolean canCross(int[] stones) {
       HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
       for(int i=0;i<stones.length;i++){
        map.put(stones[i],new HashSet<>());
       }
       map.get(0).add(1);
       for(int i=0;i<stones.length;i++){
        int currstone=stones[i];
       HashSet<Integer>set=map.get(stones[i]);
       for(int jump:set){
        int posn=currstone+jump;
        if(posn==stones[stones.length-1])
        return true;
        if(map.containsKey(posn)){
            if(jump-1>0)
        map.get(posn).add(jump-1);
        map.get(posn).add(jump);
        map.get(posn).add(jump+1);
       }

       }

    }
    return false;
}
}