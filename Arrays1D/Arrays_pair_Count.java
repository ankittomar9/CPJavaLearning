package Arrays1D;

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
i	j	arr[i]	arr[j]	Sum	Result
0	6	2	4	6	Count++
0	8	2	2	4	
0	10	2	6	8	
1	9	3	3	6	Count++
5	6	2	4	6	Count++
8	9	2	3	5	
8	10	2	6	8	
8	11	2	4	6	Count++

     * 
     */