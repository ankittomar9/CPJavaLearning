package dsa_advance.bitmanipulation;

public class Q_14_Help_from_sam {
    public static void main(String args[]){
  /*Alex and Sam are good friends.
 Alex is doing a lot of programming these days. He has set a target score of A for himself.
  Initially, Alex’s score was zero. Alex can double his score by doing a question,
 or Alex can seek help from Sam for doing questions that will contribute 1 to Alex’s score. 
 Alex wants his score to be precisely A.
 Also, he does not want to take much help from Sam.
 Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A. */
        
        int A=5;
        
        int helpCount=0;

        while(A>0){
            if((A&1)==1){
                helpCount++;
            }
            A=A>>1;        // Move to the next bit (Divide by 2)
        }
            System.out.println("minimum cost is \n"+helpCount);

}
    
}
