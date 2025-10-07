import java.util.Scanner;

public class FOR_L__Numeric_Star_Pattern {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);

        int m=scn.nextInt();
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                //// No extra spaces after ending of any row
                if (j != i) {
    				System.out.print(" ");
    			}

                
            }
            System.out.println(" ");
        }
        
    
    
    
    }
    
}
