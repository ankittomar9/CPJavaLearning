package BasicDSAImplemetations.Recursion;

public class Q_8_Linear_Search_Recursion {
    public static void main(String args[]){
        int arr[]={4,1,3,7,6};
        int target=7;
        boolean isCheck=LinearSearchHelper(arr,0,target);
        System.out.println("Linear Search Target Exists "+isCheck);

    }

    public static boolean LinearSearchHelper(int arr[],int index,int target){
        int i=index;  
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
        return LinearSearchHelper(arr,i+1,target);


    }
    
}
