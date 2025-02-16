
import java.util.Scanner;
public class CategorisethenumberNestedifelse{

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
            int x=scn.nextInt();

            if(x>0 && x%2!=0){
                System.out.println("Odd Positive");
            }else if(x<0 && x%2!=0){
                System.out.println("Odd Negative");
            }else if(x>0 && x%2==0){
                System.out.println("Even - Positive");
            }else if(x<0 && x%2==0){
                System.out.println("Even - Negative");
            }
            else{
                System.out.println("Default Invalid input");
            }
            scn.close();
    }

}

/*
 Example Input

Input 1 :
15

Input 2 :
-38


Example Output

Output 1 :
Odd-Positive

Output 2 :
Even-Negative
 */