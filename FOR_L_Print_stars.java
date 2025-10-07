import java.util.Scanner;

public class FOR_L_Print_stars {
        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();

            PrintStars(x);
        
        }
        
            public static void PrintStars(int n){
                for(int i=1;i<=n;i++){
                    System.out.print("*");
                }
            }

}
