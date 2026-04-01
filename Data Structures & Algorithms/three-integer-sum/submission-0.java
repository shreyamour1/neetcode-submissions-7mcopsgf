class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n= nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-2;i++){

            int j =i+1;
            int k=n-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum==0){
                   List<Integer> temp= new ArrayList<>();
                   temp.add(nums[i]);
                   temp.add(nums[j]);
                   temp.add(nums[k]);
                   if(!ans.contains(temp)){
                      ans.add(temp);
                   }           
                   j++;
                   k--;
                }
                else if(sum>0){
                   k--;
                }
                else{
                   j++;
                }
            }
        }

        return ans;  
    }
}
