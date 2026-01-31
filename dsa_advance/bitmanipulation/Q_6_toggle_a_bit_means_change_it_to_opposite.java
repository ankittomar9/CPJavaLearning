package dsa_advance.bitmanipulation;

public class Q_6_toggle_a_bit_means_change_it_to_opposite {
    /*Write a program that takes n and i,
         and prints the result of Toggle  the bit. 
         (changing the bit at ith location) */ 

    public static void main(String args[]){
        int n=13;
        int i=1;
        /*The Operator: XOR (^) Think of XOR as a "Difference Detector".
            1 ^ 1 = 0 (No difference -> 0)
            0 ^ 1 = 1 (Difference! -> 1)
            x ^ 0 = x (Identity: Comparing with 0 changes nothing). */

        int mask=1<<i;

        int result=n^mask;

          System.out.println("Original number :"+n);
        System.out.println("Modified number after Toggle :"+result);
    }
    
}
