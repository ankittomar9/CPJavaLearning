import java.util.Scanner;

public class Arrays_Sum {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={9,8,7,6,5,4,3,2,1};
        // int arr[]={2,9,6,7,8,2,4,5,1,3,6,2,1,6,9,3,4,6,1,2,6};
        int sum=0;        
            for(int i=0;i<=arr.length-1;i++){
                //sum=sum+arr[i];
                        System.out.print( sum=sum+arr[i]);
                         System.out.print( " ");
             //  System.out.println(    sum=sum+i);
            }

            System.out.println(" \nSum of all the elements in the array : " +sum);
    }
    
}


/*
 * 
 * Write a program to print sum of elements of the input array arr of size N.
9 17 24 30 35 39 42 44 45  
Sum of all the elements in the array : 45
 * 
 */