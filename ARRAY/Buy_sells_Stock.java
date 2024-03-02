package ARRAY;

public class Buy_sells_Stock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buy_sells_stock(prices));
    }
    public static int buy_sells_stock(int prices[])
    {
        int buyprices=Integer.MAX_VALUE;
        int Max_profit=0;
        for (int i=0;i<prices.length;i++)
        {
            if(buyprices<prices[i])
            {
                int profit=prices[i]-buyprices;
                Max_profit=Math.max(Max_profit,profit);
            }
            else {
                buyprices=prices[i];
            }

        }
        return Max_profit;
    }
}
