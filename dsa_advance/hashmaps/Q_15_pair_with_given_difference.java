package dsa_advance.hashmaps;
import java.util.HashSet;
public class Q_15_pair_with_given_difference {
    /* Problem Statement Given an array arr = {5, 10, 3, 2, 50, 80} and a Difference N = 45.
     Find if there exists a pair (x, y) such that x - y = N (or |x - y| = N)*/
    public static void main(String args[]){
        int arr[]={5,10,3,2,50,80}; 
        int n=45; 
        HashSet<Integer> set=new HashSet<>();
        boolean found =false;

        for(int i=0;i<arr.length;i++){
            int current=arr[i];

                int num1=current-n;
               if(set.contains(num1)){
                System.out.println("Pair Found: " + current + " and " + (current - n));
                found = true;
                break;
                }
        
                int num2=current+n;
                if(set.contains(num2)){
                     System.out.println("Pair Found: " + current + " and " + (current + n));
                found = true;
                break;
                }
                set.add(current);
        }       
        if (!found) {
            System.out.println("No pair found");
        }
    }   
}
