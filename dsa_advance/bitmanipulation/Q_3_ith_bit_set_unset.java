package dsa_advance.bitmanipulation;
public class Q_3_ith_bit_set_unset {
    public static void main(String args[]){
        /*Problem Statement
        Given a number n and an index i, print true if the
         i-th bit is 1 (Set), and false if it is 0 (Unset). */

      //   int n=13; //binary=(8421)=(1101) i=2;
        // int n=14; //binary=(8421)=(1110) i=2; it will also be true
            int n=9; // binary(8421)=(1001) i=2 it will be false unset    
             int i=2; 
         //we need to check whether  the ith bit is set or unset at index 2
         //Note index in binary starts from back 1101 so 3 2 1 0 at index 2 we have 1 so answer is true

             int mask=1<<i; 

             if(( n & mask)!=0){
                System.out.println("Bit at index " + i + " is SET (1)");
             }else{
                  System.out.println("Bit at index " + i + " is UNSET (0)");
             }
    }
}
