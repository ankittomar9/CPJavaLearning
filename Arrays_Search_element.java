
import java.util.Scanner;

public class Arrays_Search_element {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        
        int k=scn.nextInt();
        boolean flag=false;
        int count=0;
        int a=0;int z=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==k){
                flag=true; a=i; 
               z++;
            }
        }
        if(flag==true){
             System.out.println("Element Exists at index "+a);
        }else{
                 System.out.println("Element Doesn't Exists");
        }

        if(count==0){
             System.out.println("Element Doesn't Exists");
        }else{
           
             System.out.println("Element Exists at index "+z);

        }


    }
}
