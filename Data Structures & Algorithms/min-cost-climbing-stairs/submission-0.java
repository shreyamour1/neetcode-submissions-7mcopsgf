class Solution {
    //key is index, value is cost
    Map<Integer,Integer> mp= new HashMap<>();
    public int minCostClimbingStairs(int[] cost) {
return Math.min(minCost(cost, 0), minCost(cost, 1));      
    }


    public int minCost(int[] cost,int i){
    if (i >= cost.length) {
        return 0;
    }
    if(mp.containsKey(i)){
        return mp.get(i);
    }
    int costFromHere = cost[i] + Math.min(minCost(cost, i + 1), minCost(cost, i + 2));
    mp.put(i,costFromHere);
    return costFromHere;
    }
}


