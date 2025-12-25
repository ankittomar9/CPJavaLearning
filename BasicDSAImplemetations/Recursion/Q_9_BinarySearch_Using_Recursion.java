package BasicDSAImplemetations.Recursion;

public class Q_9_BinarySearch_Using_Recursion {
    public static void main(String args[]){
        int arr[]={10,20,40,60,90};
        int target=60;        int low=0;
        int high=arr.length-1;
            int foundIndex= BinarySearchHelper(arr,target, low, high);
            
            if(foundIndex!=-1){
             System.out.println("Linear Search Target at Exists "+foundIndex);
        }
        else{
             System.out.println("Target Not  Exists ");
        }
        }

        public static int BinarySearchHelper(int arr[],int target,int low,int high){
            //Base condition
            if(low>high){
                return -1;
            }
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target>arr[mid]){
                     return BinarySearchHelper(arr, target, mid+1,high);
            }
            
           else {
                 return BinarySearchHelper(arr, target, low,mid-1);
            }
        
        
        }
        
    }
    

