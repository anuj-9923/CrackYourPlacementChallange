class Solution {
    public int maxProfit(int[] prices) {
        int mxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i]>0)
                mxProfit+=prices[i+1]-prices[i];
        }
        return mxProfit;
    }
}