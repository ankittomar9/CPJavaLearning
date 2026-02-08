package BasicDSAImplemetations.Recursion;

public class Q_7_Check_Array_is_sorted_using_Recursion {
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        // int arr[]={1,3,4,2}; // to check the negative case
    
        boolean isCheck=isArraySorted(arr,0);

        System.out.println("Is Array Sorted : \n" + isCheck);
    }

    public static boolean  isArraySorted(int arr[],int index){
        int i=index; 
        if(i==arr.length-1){  // base case
            return true;
        }
           
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isArraySorted(arr,i+1); // recursive call

    }
    
}
