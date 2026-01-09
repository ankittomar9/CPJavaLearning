package dsa_advance.array;

public class Q_19_Best_time_to_buy_sell_stocks {
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        // Goal is to make maximum profit ; Profit= SellingPrice-CostPrice
        //Prices are in array  
        int min_price_so_far=arr[0];
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
               int current_price=arr[i];
               
               if(current_price<min_price_so_far){
                min_price_so_far=current_price;
               }

               else{
                 int profit_if_Sold_today=current_price-min_price_so_far;
               
                if(profit_if_Sold_today>max_profit){
                    max_profit=profit_if_Sold_today;
                  }
                }
        }
       System.out.println("Maximum Profit: " + max_profit);
    }
    
}
