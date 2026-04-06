class Solution {

    //do all dp problems with memoization

    Map<Integer, Integer> mp= new HashMap<>();
    public int climbStairs(int n) {

        if(n<=1){
            return 1;
        }

        if(mp.containsKey(n)){
            return mp.get(n);
        }
        else{
            int ans = climbStairs(n-1)+climbStairs(n-2);
            mp.put(n,ans);
        }
        return mp.get(n);   
    }
}
