package dsa_advance.array;

public class Q_35_Arrays_all_Subarrays_Printing {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){ //Visit every element
            
          for(int j=i;j<arr.length;j++){ // get starting and ending indexes of subarray
                System.out.print("Subarray (" + i + "," + j + "): { ");
             for(int k=i;k<=j;k++){
                    
             System.out.print(arr[k] + " ");
              
                }
             //   System.out.println("Subarray (" + i + "," + j +")"   ); //Printing
              //  System.out.print(" \n");
              System.out.println("}");
            }
        }
    }
    
}
