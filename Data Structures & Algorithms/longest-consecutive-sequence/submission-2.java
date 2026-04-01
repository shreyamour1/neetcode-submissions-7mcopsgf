class Solution {
    public int longestConsecutive(int[] nums) {

        int count =1;
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int i=1;
        int max =1;

        while(i<n){
            if(nums[i]==nums[i-1]){
                i++;
            }
            else if(nums[i]==(nums[i-1]+1)){
                count++;
                i++;
            }
            else{
                count=1;
                i++;
            }
            if(count>max){
                max=count;
            }
        }

        return max;  
    }
}
