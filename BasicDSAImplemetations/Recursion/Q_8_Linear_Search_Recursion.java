package BasicDSAImplemetations.Recursion;

public class Q_8_Linear_Search_Recursion {
    public static void main(String args[]){
        int arr[]={4,1,3,7,6};
        int target=7;
        int  isCheck=LinearSearchHelper(arr,0,target);
        if(isCheck!=-1){
               System.out.println("Linear Search Target Exists At  "+isCheck);
        }else{
             System.out.println("Linear Search Target Not Exists "+isCheck);
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
