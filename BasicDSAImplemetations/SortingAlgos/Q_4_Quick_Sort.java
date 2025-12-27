package BasicDSAImplemetations.SortingAlgos;
import java.util.Arrays;
public class Q_4_Quick_Sort {
    public static void main(String args[]){
        int arr[] = {10, 80, 30, 90, 40};
        int n = arr.length;

        System.out.println("Original Array:");
            System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted Array:");
            System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
             quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
     //   System.out.println("Pivot placed at index " 
     // + (i+1) + ". Array state: " + Arrays.toString(arr));
        return i+1;
    }
}
