import java.util.Arrays;
import java.util.Scanner;

public class Arrays_frequency_array {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
                 int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(Arrays.toString(arr)+"\n");
        System.out.println("The Frequency of "+x+" in array is : "+count);

    }
    
}

/*
Problem Description

Given an integer array A (Array of bigInt). Find and return the frequency of number B in array A.


Problem Constraints

1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109
 */