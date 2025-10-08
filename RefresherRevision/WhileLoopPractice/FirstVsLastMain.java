package RefresherRevision.WhileLoopPractice;
import java.lang.*;
import java.util.*;

public class FirstVsLastMain {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

   
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while(t-- > 0) {
            int n = scn.nextInt();
            int first = 0;
            int last = 0;
            // n on modulo with 10 will give last digit
            // and after dividing n by 10 each time we will get first digit 
            last = n % 10;
            
            while(n > 0) {
                first = n % 10;
                n = n / 10;
            }
            
            System.out.println(first + " " + last);
        
    
}


        
    }
}