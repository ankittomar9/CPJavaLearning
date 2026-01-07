package dsa_advance.array;

public class Q_6_Linear_Search {
    public static void main(String args[]){
        int arr[]={10,99,5,44,32,41,62,75,22,26,35};
        int target=62; 
        boolean isFound=false;
        //Linear Search 
        int index=0; // if duplicate this will give last index of element found
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                isFound=true;
            }

        }
            if(isFound==true){
                  System.out.println("Linear search \ntarget : "+target+" found at index : "+index);
            }else{
              System.out.println("Linear search \n target not exist");
            }
        
    }
    
}
