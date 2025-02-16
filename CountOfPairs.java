
import java.util.Scanner;

public class CountOfPairs {

    public static void main(String args[]){
        //Brute Force idea two loops
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();int count=0;

       // int arr[]={3,5,2,1,-3,7,8,15,6,13};
       // int arr[]={8,-2,1,4,3,6,8}; k==0
       int arr[]={2,7,3,14,6,1,0,10,14};

       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==k && i<j){
                count++;
            }
        }
       }
       System.out.println("Total Pairs are : "+count);
    }
    
}
 