class Solution {
    public int maxProfit(int[] prices) {
       int mxProfit=0;
        int minStockPrice=100000;
        for(int i=0;i<prices.length;i++){
               minStockPrice=Math.min(minStockPrice,prices[i]);
                if(minStockPrice<=prices[i])
                    mxProfit=Math.max(mxProfit,prices[i]-minStockPrice);
            }
        return mxProfit;
    }
}