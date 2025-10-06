import java.util.Scanner;

public class WL_Sum_of_Odds {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int i=0;int sum=0;
        while(i<=n){
            if(i%2!=0){
                sum=sum+i;
            }

            i++;
        }

        System.out.println("The sum of ODD numbers in range : "+sum); //1 3 5 7 9

    }
    

}

/*Take an integer A as input. 
You have to print the sum of all odd numbers in the range [1, A]. */