public class besttimetobuyandsellstock {
    public static int maxProfit(int[] prices){
        int profit = 0;
        int day_buy = prices[0];
        for(int j=0; j<prices.length; j++){
            if(prices[j]<day_buy){
                day_buy = prices[j];
            }else{
                int current = prices[j] - day_buy;
                if(current>profit){
                    profit = current;
                }
                // profit = Math.max(profit, prices[j]-day_buy);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println("Maximum Profit : "+result);
    }
}
