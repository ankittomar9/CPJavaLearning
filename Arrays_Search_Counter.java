import java.util.Scanner;

public class Arrays_Search_Counter {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int arr[]={2,9,6,7,8,2,4,5,1,3,6};
        int n=scn.nextInt();
        int count=0; int x=0;

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==n){
                count++;
                x=i;
            }
        }

        if(count>0){
            System.out.println("Element exists at index : "+x);
        }
        else{
            System.out.println("Element doesn't exists");
        }
    }
}


/*
 this uses counter appraoch and says keeps the count of that element 
 also the last occuring index of the finnding eleement
 */