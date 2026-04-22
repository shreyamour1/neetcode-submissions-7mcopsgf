class Solution {

    Map<Integer,Boolean> mp = new HashMap<>();
    public boolean canJump(int[] nums) {

        return jump(0,nums);     
    }

    public boolean jump(int index, int[] nums)
    {
        int n = nums.length;
        if(index>=n-1){
            return true;
        }
        if(mp.containsKey(index)){
            return mp.get(index);
        }
     
        for(int i=1;i<=nums[index];i++){
           if(index +i <n && jump(i+index, nums)){
            mp.put(index, true);
            return true;
           }
        } 

        mp.put(index, false);
        return false;
    }
}
