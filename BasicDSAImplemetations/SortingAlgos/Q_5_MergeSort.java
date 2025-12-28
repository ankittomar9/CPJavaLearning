package BasicDSAImplemetations.SortingAlgos;
import java.util.Arrays;
public class Q_5_MergeSort {
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        System.out.println("Before Sort Array \n");
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        mergeSortFunc(arr,0,n-1);
        System.out.println("Sorted Array : \n");
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSortFunc(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid= si+(ei-si)/2;
            mergeSortFunc(arr,si,mid);
            mergeSortFunc(arr,mid+1,ei);
            merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int aux_arr[]=new int[ei-si+1];

        int i=si;int j=mid+1;int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                aux_arr[k]=arr[i];
                i++;
            }else{
                aux_arr[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            aux_arr[k++]=arr[i++];
        }
        while(j<=ei){
              aux_arr[k++]=arr[j++];
        }

        //Copy back to original array
        for(k=0,i=si;k<aux_arr.length;k++,i++){
            arr[i]=aux_arr[k];
        }


    }
    
}
