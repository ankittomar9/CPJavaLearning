package Func_Practice;
import java.util.Scanner;

public class Func_AreaOfCircle {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in); 
        double n=scn.nextInt();  //4

        Func_AreaOfCircle_Func(n);
    }    
    public static void Func_AreaOfCircle_Func(double a){
        double area=0;
        area=(Math.PI) * a*a;
          System.out.println((int)Math.ceil(area));
        System.out.println(Math.ceil(area));


           String formattedArea = String.format("%.2f", area);
        
        // Print the formatted string
        System.out.println(formattedArea);
    }





}
