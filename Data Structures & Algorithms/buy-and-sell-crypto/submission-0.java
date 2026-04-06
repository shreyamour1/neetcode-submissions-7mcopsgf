class Solution {
    public int maxProfit(int[] prices) {

        int i =0;
        int ans=0;
        int n =prices.length;
        while(i<n){

            for(int j =i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    ans= Math.max(ans, prices[j]-prices[i]);

                }
            }
            i++;
        }
        return ans;
        
    }
}
