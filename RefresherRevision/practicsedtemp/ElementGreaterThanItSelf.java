package RefresherRevision.practicsedtemp;

import java.util.Scanner;

public class ElementGreaterThanItSelf  {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        //int arr[]={2,5,1,4,8,0,8,1,3,8};
        int arr[]={2,5,1,4,8,0,8,1,3,8,10,7,8,10};

        int max=Integer.MIN_VALUE; int count=0;
      //  System.out.println(max);
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
        }
            
        }
        System.out.println("Elements in array : " +arr.length  );
        System.out.println("Maximum element " +max);

      

        for(int j=0;j<arr.length;j++){
            if(arr[j]==max){
                count++;
            }
        }
          System.out.println("Count of elements greater than itself : " +(arr.length-count));
    }


   
    
}


/*
 * Element greater than itself
 * logic thinking find maximum element
 * Do think what to do after finding maximum element
 * total element     count/freq of max element
 * think about initial maximum
 * 
 */