
import java.util.Scanner;

public class Arrays_Search_element {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        
        int k=scn.nextInt();
        boolean flag=false;
      
      //  int a=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==k){
                 System.out.println("Element Exists at index "+i);
                flag=true; 
              
            }
        }
        if(!flag){
              System.out.println("Element Doesn't Exists");
        }

       

    }
}
