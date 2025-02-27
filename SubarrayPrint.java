
import java.util.Scanner;

public class SubarrayPrint {
    public static void main(String args[]){
        int arr[]={4,8,6,2,4,3,1,12,15};
        Scanner scn=new Scanner(System.in);
        int start=scn.nextInt();
        int end=scn.nextInt();

        for(int i=start;i<=end;i++){
            
            System.out.print( " "+arr[i]);
        }
        scn.close();
    }
}

/*/
 int arr[]=      {1,2,3,4,5,6,7,8,9};
Input  int arr[]={4,8,6,2,4,3,1,12,15};
O/p : 6 2 4 3 1

*/