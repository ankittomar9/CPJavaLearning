import java.util.Arrays;

public class RotateArrayKtimes {
    public static void main(String args[]){
       int arr[]={2,5,1,4,8,0,8,1,3,8};
       int k=4;   //
       int n=arr.length;
            reverseArray(arr,0, n-1);
            reverseArray(arr, 0,k-1);
            reverseArray(arr, k,n-1);

    }
    public static  void reverseArray(int[] arr,int k){

         //  int i=arr[0];int j=arr[arr.length-1];
       int i=0; int j=arr.length-1;  
       while(i<j){

        int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

            i++;
            j--;
         }
         System.out.println(Arrays.toString(arr));

       for(int l=0;l<arr.length;l++){
        System.out.print(" "+arr[l]);
    } 
    
 }
}