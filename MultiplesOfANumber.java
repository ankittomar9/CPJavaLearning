
import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        
        MultiplesOfANumberFunc(x);


    }

    public static void MultiplesOfANumberFunc(int a){
        int i=1;
        while(i<=a){
            if(i%4==0){
                System.out.print(" "+i);

            }
            i++;
        }
    
    }

    
}

/*Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.
Problem Constraints
1 <= N <= 10000
Input Format
Single line containing an integer N.
Output Format
Space separated integers representing multiples of 4 less than or equal to N.
Examle Input
22
Example Output
4 8 12 16 20
Example Explanation
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
4 * 4 = 16
5 * 4 = 20
All are multiples of 4 less than 22 */