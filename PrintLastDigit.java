
import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
       int z= PrintTheLastDigitFunc(x);


        System.out.println("Last  Element : " +z);

    }

    public static int PrintTheLastDigitFunc (int a){
           a=a%10;
        //     System.out.println(" Sout 1 : " +a);
        //    // a=a/10;
            int y=a;
        //   System.out.println(" Sout 2 : " +y);
            return y;
        
    } 
    
}
/*Input Format


Single line containing an integer.


Output Format

Print in a single line the last digit of input integer.


Problem Constraints

1 <= N <= 1000


Example Input

Input 1:-

3


Input 2:-

29


Example Output

Output 1:-

3


Output 2:-

9 */