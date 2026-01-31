package dsa_advance.bitmanipulation;

public class Q_8_Count_number_of_set_bits {
    public static void main(String args[]){
        int n=11; // binary =(8421)=(1011) 
         // output is 3 (there are three 1 in 11 binary)
            int count=0;
           //A & 1 = if bit in A is set answer is 1 else bit is unset in A answer is 0 gatekeeper 
           //Appraoch one
            for(int i=0;i<32;i++){ 
                if((n & (1<<i)) !=0){
                     count++;
                }   
            }
            System.out.println("Count of Set bits are : \n"+count);

            // Approach 2 Better approach
              int n1=11 ;
            int count1=0;
            while(n1>0){
                if((n1 & 1) != 0){
                    count1++;
                }
                n1=n1>>1;
            }
                System.out.println("Count of Set bits are : \n"+count1);
    }
    
}
