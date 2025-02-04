import java.util.Scanner;
public class MaxOfThree {

    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();int c=scn.nextInt(); 

        if(a>b && a>c){
            System.out.println("a is Maximum number: "+a);
        }else if(b>a && b>c){
            System.out.println("b is Maximum number :"+b);
        }
        else if(c>a && c>a){
            System.out.println("c is Maximum number: "+c);
        }


    }
}

/*
 Maximum of three 6 7 8
 8

 max of  1000 
 10000
 100000

 10000
 */