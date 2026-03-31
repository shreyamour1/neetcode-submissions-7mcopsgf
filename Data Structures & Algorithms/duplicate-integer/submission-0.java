class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> mp= new HashSet<>();

        for(int i=0;i<n;i++){
          if(mp.contains(nums[i])){
              return true;
          }
          else{
              mp.add(nums[i]);
          }
        }
        return false;     
    }
}