import java.util.Arrays;

public class RotateArrayKtimes {
    public static void main(String args[]){
       int arr[]={2,5,1,4,8,0,8,1,3,8};  // 8 1 3 8 2 5 1 4 8 0
       int k=4;   //
       int n=arr.length;
            reverseArray(arr,0, n-1);
              System.out.println(Arrays.toString(arr)); //function 1 call
          
              reverseArray(arr, 0,k-1);
              System.out.println(Arrays.toString(arr));//function 2 call
          
              reverseArray(arr, k,n-1); 
             System.out.println(Arrays.toString(arr));//function 3 call


    }
    public static  void reverseArray(int[] arr,int start,int k){

         //  int i=arr[0];int j=arr[arr.length-1];
       int  i=start;  int j = k; 
       while(i<j){

        int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;

            i++;
            j--;
         }
       ///  System.out.println(Arrays.toString(arr));

   //     for(int l=0;l<arr.length;l++){
   //      System.out.print(" "+arr[l]);
   //  } 
    
 }
}

/*
Input array  and rotation times 
int arr[]={2,5,1,4,8,0,8,1,3,8};
       int k=4;   //

       output : 
       [8, 3, 1, 8, 0, 8, 4, 1, 5, 2]
       8 3 1 8 0 8 4 1 5 2 //wrong 

       new
       [8, 3, 1, 8, 0, 8, 4, 1, 5, 2]
[8, 1, 3, 8, 0, 8, 4, 1, 5, 2]
[8, 1, 3, 8, 2, 5, 1, 4, 8, 0]


*/

