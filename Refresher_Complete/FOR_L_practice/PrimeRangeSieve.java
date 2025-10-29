package FOR_L_practice;
 import java.util.Arrays;
import java.util.Scanner;
public class PrimeRangeSieve {
    public static void printPrimes(int N) {
        // 1. Create a boolean array (Sieve) of size N+1. 
        // We use N+1 because the array index represents the number itself.
        boolean[] isPrime = new boolean[N + 1];
        
        // Initialize all numbers as potentially prime (true)
        Arrays.fill(isPrime, true);
        
        // 0 and 1 are not prime
        if (N >= 0) isPrime[0] = false;
        if (N >= 1) isPrime[1] = false;

        // 2. Start Sieving from p = 2
        // We only need to check up to the square root of N for efficiency.
        for (int p = 2; p * p <= N; p++) {
            
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p] == true) {
                
                // 3. Mark all multiples of p as not prime
                // Start marking from p*p, because all smaller multiples (e.g., 2p, 3p) 
                // would have already been marked by their smaller prime factors (2, 3, etc.).
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        // 6. Print all prime numbers
        System.out.println("Prime numbers up to " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the upper limit (N): ");
        int N = scn.nextInt();
        
        if (N < 2) {
            System.out.println("No primes in this range.");
        } else {
            printPrimes(N);
        }
    }
}

    

