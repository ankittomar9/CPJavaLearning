package dsa_advance.array;

public class Q_13_Arrays__Q_Queries_Sum_brute {
    public static void main(String args[]){
        int arr[]={10,20,10,5,15};
        //Query can be given in pair or 2D array or Object way
        //Find sum between  index 1 and 3
          int start=1; int end=3;   int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+arr[i];  
        }
        System.out.println("Sum of range is : "+sum); // answer should be 35  
        
    }
    
}
