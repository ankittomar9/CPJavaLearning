package dsa_advance.bitmanipulation;
public class Q_12_Find_the_nth_magic_number {
    public static void main(String args[]){
        /*A number is called "Magic" if it can be written
         as a sum of unique powers of 5.
         The numbers are sorted in increasing order. */
        long n=3;
        /*       // Binary 011 -> Expected: 5^1 + 5^2 = 5 + 25 = 30        */
        long power=5;
        long answer=0;

        while(n>0){
            if( (n & 1)==1){  // 1. Check if the last bit is 1
                answer=power+answer;
              
            }
              power=power*5;
                n=n>>1;
        }
       System.out.println("Nth Magic Number: " + answer);
    }
    
}
