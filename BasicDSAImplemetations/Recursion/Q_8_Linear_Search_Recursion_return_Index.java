package BasicDSAImplemetations.Recursion;

public class Q_8_Linear_Search_Recursion_return_Index{
    public static void main(String args[]){
        int arr[]={4,1,3,7,6};        int target=7;
        int foundIndex=LinearSearchHelper(arr,0,target);
        
        if(foundIndex!=-1){
             System.out.println("Linear Search Target at Exists "+foundIndex);
        }
        else{
             System.out.println("TargetNot  Exists ");
        }
    
    }
    
    public static int LinearSearchHelper(int arr[],int index,int target){
        int i=index;  
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return index;
        }
        return LinearSearchHelper(arr,i+1,target);


    }
    
}
