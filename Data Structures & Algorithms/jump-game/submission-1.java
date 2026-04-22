class Solution {

    public boolean canJump(int[] nums) {

      // greedy 

      int n = nums.length;
      int maxJump=0;

       for(int i=0;i<n;i++){

        if(maxJump<i){
            return false;
        }
        
           
         maxJump= Math.max(nums[i]+i, maxJump);
       }
       return true;

    }
}
