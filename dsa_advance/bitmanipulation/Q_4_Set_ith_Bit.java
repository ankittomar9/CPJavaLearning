package dsa_advance.bitmanipulation;

public class Q_4_Set_ith_Bit {
    public static void main(String args[]){
        /*Write a program that takes n and i,
         and prints the result of Setting the bit. (changing the bit at ith location) */
        int n=9;
        int i=1;

        int mask=1<<i;
        int result= n | mask; // check dry run why we did OR here with mask
        // 9 -> Binary(8421) -> 1001 
        // 11 -> Binary(8421) -> 1011 which is  

        System.out.println("Original number :"+n);
        System.out.println("Modified number after setting :"+result);
    }
    
}
