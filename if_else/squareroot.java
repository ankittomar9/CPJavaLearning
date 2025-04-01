package if_else;
import java.util.Scanner;

public class squareroot {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int N=scn.nextInt();

        for(int i=1;i<=N;i++){
            if(i*i==N){
                break;
                
            }
            System.out.println("Break the loop "+i);
        }
       
    }
}

/*
input  4
        10 
 loop ran from 1 to 10 and not 100 because it fails if condition on 10th iteration
 */