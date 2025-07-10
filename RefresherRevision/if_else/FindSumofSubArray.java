package if_else;
import java.util.Scanner;

public class FindSumofSubArray {

    public static void main(String args[]){
          int arr[]={4,8,6,2,4,3,1,12,15};
        Scanner scn=new Scanner(System.in);
        int start=scn.nextInt();
        int end=scn.nextInt();
        int sum=0;

        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of SubArray is "+sum);
            scn.close();
    }
    
}

/*
  int arr[]={4,8,6,2,4,3,1,12,15};
Sum of SubArray is 16

 */