package dsa_advance.bitmanipulation;

public class Q_11_Unset_bits_from_right {
    public static void main(String args[]){
       /*Problem Statement Given an integer A and an integer B.
        Unset the last B bits of A (make them 0). */
        long A=25; long B=3;
        //we want to to turn the last three bits of 25 to zero final answer (11000) 001 to 000
        //25 Binary(168421 this is conversion code) -> (11001) 
        //Binary of 3 (8421) -> (000101)

        for(int i=0;i<B;i++){
             
            long mask= 1L<<i;
           
            A=A & ~(mask);
        }

        System.out.println(A);

    }
    
}
