package WL_ALL_Practice_Programs;
import java.util.Scanner;

/*Revise this again */

public class WL_Bank_Account_2 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        long initial_balance=scn.nextLong();  //N
        long number_of_operations=scn.nextLong();  //M
        long new_balance=0;


        while(number_of_operations>0){
            int type=scn.nextInt();
             long value=scn.nextLong();  //M

                if(type==1){
                    new_balance=initial_balance+value;
                     System.out.println(new_balance);
                }
                else if (type == 2) {
                        if (value > initial_balance) {
                            // Insufficient Funds: Print message and SKIP the transaction.
                            System.out.println("Insufficient Funds");
                        } else {
                            // Sufficient Funds: Perform the calculation and UPDATE the balance.
                            initial_balance = initial_balance - value;
                            System.out.println(initial_balance);
                        }
                    }




            number_of_operations--;
        }
        
        



    }

}
