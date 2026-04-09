class Solution {
    Map<Integer,Integer> mp= new HashMap<>();
    public int rob(int[] nums) {
        return robMax(nums,nums.length-1);
    }

    public int robMax(int[] nums, int i){

        if(i<0 || i>=nums.length){
            return 0;
        }
        if(i==0){
            return nums[0];
        }
        if(i==1){
            return Math.max(nums[0],nums[1]);
        }
        if(mp.containsKey(i)){
            return mp.get(i);
        }
        
        int  ans= Math.max(robMax(nums,i-1),nums[i]+robMax(nums,i-2));

        mp.put(i,ans);
        return ans;
    }
}
