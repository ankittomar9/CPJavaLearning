package if_else;

import java.util.Scanner;
public class whichTriangle {
    public static void main(String args[]){
     Scanner scn=new Scanner(System.in);
     int a=scn.nextInt();
     int b=scn.nextInt();
     int c=scn.nextInt();

     if(a==b && b==c && a==c){
        System.out.println("Equilateral Triangle");
     }
          else if(a!=b && b!=c && a!=c){
        System.out.println("Scalene Traingle");
     }
    // else if((a!=b && b==c && a==c) || (a==b && b!=c && a==c) || (a==b && b==c && a!=c) ){
        else if(a==b || b==c || a==c){
        System.out.println("isosceles Triangle");
     }
     scn.close();        
    }
}

/*
 3 4 3 isosceles
 7 4 5 Scalene
 7 7 7  Equilateral
 */