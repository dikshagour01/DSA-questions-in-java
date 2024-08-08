public class Stock_span{
    public static int BuyAndSellStock(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int ans = BuyAndSellStock(prices);
        System.out.println("profit gain : "+ans);
    }
}