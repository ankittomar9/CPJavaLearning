import java.util.Scanner;

public class FOR_L_Two_Line_Star {
    public static void main(String args[]){
        // Scanner scn=new Scanner(System.in);
        // int x=scn.nextInt();

        // for(int i=0;i<x;i++){
        //      System.out.print('*');
        //     for(int j=1;j<i-1;j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("*\n");
        // }

        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        // The outer loop controls the N rows to be printed
        for (int i = 1; i <= N; i++) {
            
            // Print the starting asterisk
            System.out.print("*");
            
            // Determine the number of spaces needed
            int spaces = N - 2;
            
            // Handle the N=2 edge case explicitly.
            // If N=2, spaces is 0, so the inner loop won't run, 
            // and we go straight to the ending asterisk.
            if (spaces > 0) {
                
                // The inner loop prints N-2 spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
            }
            
            // Print the ending asterisk
            System.out.print("*");
            
            // Move to the next line
            System.out.println();
        }
    }
}
        
    
    

