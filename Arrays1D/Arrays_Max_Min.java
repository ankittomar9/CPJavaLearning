package Arrays1D;
public class Arrays_Max_Min {
    public static void main(String args[]){
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};

            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         System.out.println("The maximum value in array is : " +max);
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

         System.out.println("The minimum value in array is : " +min);
    
    }
    
}


/*
 
Problem Description

Take input an array A of size N and write a program to print maximum and minimum elements of the input. 
The maximum value in array is : 9
The minimum value in array is : 1

 */