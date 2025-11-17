package Arrays;

import java.util.Scanner;

public class ArraysSettingElementMax {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={2,4,3,1,5}; //n=3
        int n=scn.nextInt(); boolean ele=false;
        int operation_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                ele=true;        
         }
           if(arr[i]>n){
            operation_count++;
         }
        }
         

         if(!ele){
               System.out.println("-1");
         }else{
            System.out.println(operation_count);  
         }
      
        
    }
    
}
