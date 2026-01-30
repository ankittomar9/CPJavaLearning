package dsa_advance.bitmanipulation;
public class Q_5_Unsetting_a_Bit {
    public static void main(String args[]){
          /*Write a program that takes n and i,
         and prints the result of UnSetting the bit. (changing the bit at ith location) */ 

         int n=13;
         // int n=11;
         int i=2; // i=1
        // for this we AND Operator  and 1 more not operator 
        // a & 1 = a 
        // a & 0 = 0

        int mask=1<<i; //mask is created using left shift
        
        int result= n & ~(mask); //here we reversed the mask and then apply AND 

          System.out.println("Original number :"+n);
        System.out.println("Modified number after Unsetting :"+result);
        }
    
}
