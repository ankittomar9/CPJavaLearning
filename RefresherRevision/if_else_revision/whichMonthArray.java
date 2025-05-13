package RefresherRevision.if_else_revision;

import java.util.Scanner;

public class whichMonthArray {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int z=scn.nextInt();

        whichMonthArrayIs(z);


    }

    public static void whichMonthArrayIs(int a){
        String arr[]={"","January","February","March","April","May",
        "June","July","August","September","October","November","December"};

      
        if(a>=1 && a<=12){
            System.out.println(arr[a]);
        }else 
         System.out.println("Invalid Input");
    

    }
    
}


/*

 Problem Constraints
1 <= N <= 12

Input: 
 I/P:1 : 4
 Output: April

 I/P:1 :9
 Output:September

 Exp: Not required

 */