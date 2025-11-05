
import java.util.Scanner;

public class ArraysGoodPair {
    public static void main(String args[]){
        int arr[]={2,4,6,9,7,1,5,3,6,4,2};
        Scanner scn=new Scanner(System.in);

        int k=scn.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}



/*
 Problem Description
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
 Check if any good pair exist or not.
 */