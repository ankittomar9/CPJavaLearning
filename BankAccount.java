import java.util.Scanner;

public class BankAccount {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        double x=scn.nextDouble();
         double y=scn.nextDouble();
          double z=scn.nextDouble();

        BankAccountFunc(x,y,z);

    }

    public static void BankAccountFunc(double amount,double type ,double charge){
        if(type==1 ){
            System.out.println("Amount is added to existed balance is : " +(amount+charge));
        }else if(type==2 && amount>charge){
              System.out.println("Amount is deducted from existed balance is : " +(amount-charge));
        }
        else if(charge>amount){
              System.out.println("Insufficicent funds ");
        }

    }
    
}
