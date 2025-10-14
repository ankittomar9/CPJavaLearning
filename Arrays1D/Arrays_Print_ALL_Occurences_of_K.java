package Arrays1D;
import java.util.Scanner;

public class Arrays_Print_ALL_Occurences_of_K {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
           int arr[]={2,9,6,7,8,2,4,5,1,3,6,2,1,6,9,3,4,6,1,2,6};
           boolean flag=false;
           
              System.out.println("Indices where " + n + " is present:");

           for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==n){
                System.out.println("Element exists at index  : "+i);
                
                flag=true;
                //break;
            }
           }

           if(!flag){
             System.out.println("Element doesn't exists ");   
           }
        

    }
}


/*
 *  find the indices where n is present
 * 
Indices where 6 is present:
Element exists at index  : 2
Element exists at index  : 10
Element exists at index  : 13
Element exists at index  : 17
Element exists at index  : 20

 * 
 * 
 */