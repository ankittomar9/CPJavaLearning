import java.util.Scanner;

public class Func_Power_Function {
        public static void main(String args[]){ 
            Scanner scn=new Scanner(System.in);

            int a=scn.nextInt();
            int b=scn.nextInt();
            Func_Power_Function_1(a,b);

        }    
            public static void Func_Power_Function_1(int x,int y){
                if(y==0){
                    System.out.println(+x+" power  "+y+ " is  : 1");
                }
                int power=1;    // a^b= a*a*a*a....btimes

                for(int i=1;i<=y;i++){
                    power=power*x;
                }

                System.out.println(power);



            }

}
