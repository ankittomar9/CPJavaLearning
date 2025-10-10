package RefresherRevision.practicsedtemp;
import java.util.Arrays;

public class ReversetheArrayRange {
    public static void main(String args[]){
        int arr[]={2,5,1,4,8,0,8,1,3,8};
        int l=2;int r=6; // range from where the array needs to be reversed

        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
        System.out.println(Arrays.toString(arr));


    }
    
}
/*Range is given  and reverse the array from within the Range*/