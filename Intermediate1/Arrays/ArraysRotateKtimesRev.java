import java.util.Arrays;
public class ArraysRotateKtimesRev {
    public static void main(String args[]){
        int arr[]={-1,2,3,6,5,4,8};
         int n=arr.length;
        int k=4;
        k=k%n;
    
        if (k == 0) {
            System.out.println("Array Before Rotation: " + Arrays.toString(arr));
            System.out.println("Array After Rotation k=" + k + " times: " + Arrays.toString(arr));
            return;
        }

        System.out.println("Array Before Rotation: " + Arrays.toString(arr));

        int start=0;int end=arr.length-1;
       
        RotateArrayHelper(arr,0,n-1);
        RotateArrayHelper(arr, 0, k - 1);
        RotateArrayHelper(arr, k, n - 1);

        System.out.println("Array After Rotation k=" + k + " times:");
        System.out.println(Arrays.toString(arr));
        
    }


    public static void RotateArrayHelper(int arr[],int start,int end){
       int i=start;int j=end;
       
        while(i<j){
            int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        i++;
        j--;
        }

        
    }
    
}
