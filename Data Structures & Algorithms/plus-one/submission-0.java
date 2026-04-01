class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 1;
        int[] ans = new int[n+1];
        for(int i=n-1;i>=0;i--){
            int rem=digits[i]+sum;
            digits[i]=(rem)%10;
            sum= rem/10;
        }
        if(sum>0){
            ans[0]=sum;
            for(int i=0;i<n;i++){
                ans[i+1]=digits[i];
            }
            return ans;
        }
        else{
            return digits;
        }     
    }
}
