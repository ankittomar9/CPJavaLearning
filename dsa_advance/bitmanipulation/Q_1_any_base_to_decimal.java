package dsa_advance.bitmanipulation;
public class Q_1_any_base_to_decimal {
    public static void main(String args[]){
   /*You are given a number A. You are also given a base B. A is a number on base B.
 You are required to convert the number A into its corresponding value in decimal number system. */
     //   int A=1010;int B=2;        // int A=22; int B=3;
       // base two is binary base 3 is ternary base 8 is octal and base 10 is decimal
       //base 16 is Hexa Decimal
      // int n=1101; int b=2; //output =13
       int n=1010;int b=2; 
        int answer=0;int power=1;
        if (n == 0) {    System.out.println(0);  return;}

       while(n>0){
        int remainder=n%10;
        //Edge case important
        if (remainder >= b) {System.out.println("Invalid Number for Base " + b);        return;     }
        answer=answer+remainder*power;
        n=n/10;
        power=power*b;
        
       }
     System.out.println("Decimal Value: " + answer);
    }    
}
