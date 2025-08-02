import java.util.*;
public class BuySellStocks {
    public static void BuyAndSell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int sellprice=0;
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            } else {
                buyprice=prices[i];
            }
        }
        System.out.println(maxprofit);
        System.out.println("the buyprice is "+buyprice);
    }



    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        BuyAndSell(prices);
    }
    
}
