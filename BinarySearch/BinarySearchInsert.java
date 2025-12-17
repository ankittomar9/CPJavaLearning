package BinarySearch;

public class BinarySearchInsert {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int k=16;

        BinarySearchFunc(arr,k);
    }
    
   public static void  BinarySearchFunc(int arr[],int target){
    int n=arr.length; int low=0; int high=n-1;
            boolean isFound=false; 
    while(low<=high){
        int mid=low+(high-low)/2;

        if(arr[mid]==target){
            System.out.println("Element to be inserted "+mid);
            isFound=true;
            break;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=high-1;
        }

    }
    if(isFound==false)
    System.out.println("Element needs to be inserted at "+low);


   }


}
