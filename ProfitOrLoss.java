
import java.util.Scanner;

public class ProfitOrLoss {

public static void main(String args[]){
    Scanner scn=new Scanner(System.in);
    double SellingPrice=scn.nextDouble();
    double CostPrice=scn.nextDouble();
        ProfitOrLossFunc(SellingPrice,CostPrice);

}

  public static void  ProfitOrLossFunc(double SellingPrice , double CostPrice){
           double profit=SellingPrice-CostPrice;
           double loss= CostPrice-SellingPrice;

           if(CostPrice < SellingPrice ){
            System.out.println("Profit is : \n" +profit);
           }
           else if (CostPrice > SellingPrice ){
             System.out.println("Loss is : \n" +loss);
           }
           else {
        System.out.println("Neither profit nor loss.");
    }

    }
    
}


/*You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.
NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.
Problem Constraints
1 <= C, S <= 109
C ≠ S

Input Format
First line of the input contains a single integer C.
Second line of the input contains a single integer S. */