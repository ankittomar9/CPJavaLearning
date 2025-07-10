package if_else;
import java.util.Scanner;

public class CountFactorsOptimized {
    public static void main(String args[]){
        int count=0;
        Scanner scn=new Scanner(System.in);
        int range=scn.nextInt();

        for(int i=1;i*i<=range;i++){  /// if i is a factor of N then
                                                    // n/i is also a factor of n  
            if(range%i==0){
                if(i!=range/i){  // extra condition checking dupilcate counting of factors
                    // for perfect square numbers
                    count+=2;
                }
                else count+=1;
            }
        }
        System.out.println("factors are : "+count);
    }
    
}


/*/
for input the edge case because of sqaure root
100 factors are  1 2 5 10 20 25 50 100
Incase of perfect case we get odd factors






*/





