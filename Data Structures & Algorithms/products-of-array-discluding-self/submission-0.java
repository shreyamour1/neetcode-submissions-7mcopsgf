class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] left = new int[n];
      int[] ans = new int[n];
      left[0] = nums[0];
      for(int i=1;i<n;i++){
       left[i]=nums[i]*left[i-1];
      }
      for(int i=n-2;i>=0;i--){
       nums[i]=nums[i]*nums[i+1];
      }
      ans[0]=nums[1];
      ans[n-1]=left[n-2];

      for(int i=1;i<n-1;i++){
       ans[i]=left[i-1]*nums[i+1];
      }
      return ans;

    }
}  
