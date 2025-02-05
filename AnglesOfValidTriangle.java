
import java.util.Scanner;

public class AnglesOfValidTriangle {
    
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
            float a=scn.nextInt();            float b=scn.nextInt();
            float c=scn.nextInt();
        
        float sumofanglesoftraingle=180;
        float calculatedsumofanglesoftraingle=a+b+c;

        if(sumofanglesoftraingle==calculatedsumofanglesoftraingle){
           System.out.println("Valid Triangle");
        }else{
            System.out.println("Not a Valid Triangle");
        }
    }
}

/*Example Input

Input 1:
 60
 60
 60
Input 2:
 30
 40
 50

Example Output
Output 1

 1 
Output 2:

 0  */