import java.util.Scanner;

public class FOR_L_HCF {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();
        int m=scn.nextInt();

        int hcf=0;

        int limit = Math.min(n, m); 

        //for(int i=1;i<=m*n;i++){ // inefficient comparison
        //         for(int i=1;i<=n || i<=m;i++){  less comparison
        for(int i=1;i<=limit;i++){
            if(m%i==0 && n%i==0){
                hcf=i;
            }

        }

        System.out.println(hcf);



    }
    
}


/*
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers
 happens to be the largest positive integer that divides the numbers without leaving a remainder. 
 */