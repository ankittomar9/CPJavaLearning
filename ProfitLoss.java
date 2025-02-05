
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        float CostPrice=scn.nextInt();
        float SellingPrice=scn.nextInt();
        float profit=SellingPrice-CostPrice;
        float loss=CostPrice-SellingPrice;

        if(CostPrice >SellingPrice && CostPrice!=SellingPrice){
            System.out.println("You Made a Loss : " +loss);
        }else if(CostPrice < SellingPrice && CostPrice!=SellingPrice){
            System.out.println("You Made a Profit : "+profit);
        }

    }
    
}

/*
 * 
Input
 100
120
You Made a Profit : 20.0



 */