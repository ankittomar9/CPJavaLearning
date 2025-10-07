import java.util.Scanner;
/*Revision */
public class FOR_L_LCM_using_GCD {

 public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();int y=scn.nextInt();  
        // 1. Find the GCD first
       int gcd = findGCD( x,y);

       // 2. Apply the LCM formula
    // We use (n / gcd) * m to avoid potential intermediate overflow of n * m
       int lcm = (x / gcd) * y; 

              System.out.println(lcm);
    }




    public static int findGCD(int n, int m) {
    int gcd = 1; // Start with 1, as 1 is always a common divisor
    int limit = Math.min(n, m);

    for (int i = 1; i <= limit; i++) {
        if (n % i == 0 && m % i == 0) { // logic to check the LCM
            gcd = i; // Keep updating the gcd. The last update will be the GCD.
        }
    }
    return gcd;
}


}
