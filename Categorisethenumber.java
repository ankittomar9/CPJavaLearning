import java.util.Scanner;

public class Categorisethenumber {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n==0){
            System.out.println("Zero");
        }

       else if(n%2==0 &&n>0){  //n%2==0 n%2!=0
            System.out.println("Even Positive");
        }
        else if (n%2==0 &&n<0){  
             System.out.println("Even Negative");
        } else if (n%2==-1 && n<0){
             System.out.println("Odd Negative");
        } else if (n%2==1 && n>0){
             System.out.println("Odd Positive");
        }

    }
    
}
