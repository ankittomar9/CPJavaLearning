package dsa_advance.bitmanipulation;

public class Q_13_reverse_bits {
    public static void main(String args[]){
        /* Problem description :
        Reverse the bits of an 32 bit unsigned integer A. */
        long a=3;
    long answer=0;
    long count=0;

    while(count<32){
        answer = answer << 1;  //
        if((a&1)==1){
            answer=answer+1;
        }
        count++;

        a=a>>1;
      }
     System.out.println(answer);

    }
    
}
