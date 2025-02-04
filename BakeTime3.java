
import java.util.Scanner;

public class BakeTime3 {
    
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
            int layer=scn.nextInt();
            int bake=scn.nextInt();
            layer=layer*2;

            System.out.println("Total time taken for lagsna to be made : " +(layer+bake) );
        
    }
}


/*
 Problem Constraints
1 <= N <= 20 layers
0 <= M <= 40 bake 

Input 1:-
3
20

Input 2:-
1
29

Example Output

Output 1:-
26

Output 2:-
31


 */