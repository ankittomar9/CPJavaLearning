public class ArraysSecondLargest {
    public static void main(String args[]){
        int[] arr={1,7,8,9,4,6,2,5,1,3,4,8};
    int max=Integer.MIN_VALUE; 
    int second_max=  Integer.MIN_VALUE; 
        if(arr.length<=1){
    //     is_exists=false;
          System.out.println("No elements exists");
       
        }

    for(int i=0;i<arr.length;i++){
        
        if(arr[i]>max){
            second_max=max;
            max=arr[i];
        }
        else if(arr[i]>second_max && arr[i]<max)
        second_max=arr[i];

    }
    

    System.out.println(max);
     System.out.println(second_max);

    }
    
}


/*
 You are given an integer array A. 
 You have to find the second largest 
 element/value in the array or report that no such element exists

Appraoches sorting the array O(Nlogn) n-2 element is second largest
if array has 1 element 

 * 
 */