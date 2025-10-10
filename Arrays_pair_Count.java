
import java.util.Scanner;

public class Arrays_pair_Count {
        public static void main(String args[]){
            Scanner scn=new Scanner(System.in);
          //  int arr[]={1,2,3,2,1}; 
             int arr[]={2,3,6,7,8,2,4,5,2,3,6};
            
            int x=scn.nextInt();
                int count=0;            
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                  if(arr[i]+arr[j]==x){
                    count++;

                  }    
                }
               
            }
             System.out.println(count);



        }
    }


    /*
     *  x=6 
     * count=4
     * 
     * You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B
     * 
     * 
     */