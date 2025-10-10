package RefresherRevision.practicsedtemp;

public class ArraysCountOfPairsSum {
    public static void main(String args[]){
        int arr[]={8,2,6,4,7,5,6,7,3,1};
        int count=0;int n=arr.length; int k=10;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")"); 
                    count++;
                }
               
            }

        }
        System.out.println("Number of Pairs are : "+count);

    }
    
}


/*
 * 
 * 
 * 
 * 
 */