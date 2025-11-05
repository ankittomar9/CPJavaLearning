import java.util.Arrays;

public class ArraysReverseTheArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
         System.out.println(Arrays.toString(arr));
        int i=0;int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        System.out.println("After Reverse : ");
        System.out.println(Arrays.toString(arr));

    }
    
}
