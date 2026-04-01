class Solution {
    public int[] twoSum(int[] nums, int target) {


      Map<Integer,Integer> mp= new HashMap<>();
      int[] ans = new int[2];

      for (int i=0;i<nums.length;i++){

        int remaining = target-nums[i];

        if(mp.containsKey(remaining)){
          ans[0]=mp.get(remaining)+1;
          ans[1]= i+1;
        }
        else{
          mp.put(nums[i],i);
        }
      }
     return ans;
        
    }
}
