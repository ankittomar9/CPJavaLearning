package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_reverse_input {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();

        int arr[]=new int[x];

        for(int i=0;i<=arr.length-1;i++){
            arr[i]=scn.nextInt();
        }
         System.out.print("Original Array\n ");
        System.out.print(Arrays.toString(arr));

         System.out.print("\nReversed Array\n");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }


    }
}

/*Problem Description

Write a program to print the input array A of size N in reverse order where you have to take integer N and further N elements as input from user.

Problem Constraints

1 <= N <= 1000  
1 <= A <= 1000
Input Format

A single line representing **N** followed by N integers of the array **A**
Output Format

A single line containing N space separated integers representing elements of the input array in reverse order.  
**Note** - Keep a space character (' ') at the end of the line.
Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80
Example Output

Output 1:

5 4 3 2 1 
Output 2:

80 40 50 10 
 */