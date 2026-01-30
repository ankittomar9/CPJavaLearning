package dsa_advance.bitmanipulation;
public class Q_2__decimal_to_any_base {
    public static void main(String args[]){
        /*Let's start with Q8: Decimal to Any Base. If you can convert Decimal to "Any Base", you can convert it to Binary (Base 2),
         Octal (Base 8), or Hex (Base 16). The logic is universal.
         */
        /*he Logic: Repeated Division Imagine you have the number 13 and want to convert it to Binary (Base 2).
         You divide by the base (2) and keep the remainder. */


         int n=13; int b=2; 
            // expected output // 1101
         int  answer=0;int power=1;

         while(n>0){
            int remainder=n%b;
            answer=answer+remainder*power;
            n=n/b;
            power=power*10;
         }

         System.out.println("Converted number from decimal to anyBase  : \n"+answer);
    }
    
}
