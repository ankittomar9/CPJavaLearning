import java.util.Scanner;

public class FOR_L_LCM {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();int y=scn.nextInt();
        
        FOR_L_LCM_Func( x,y);
       

    }
   public static void  FOR_L_LCM_Func(int n,int m){

     int mx = Math.max(n,m); int mn=Math.min(n,m);

            for(int i=mn;i<=n*m ;i++){
                         if (i % n == 0 && i % m == 0) {
            System.out.println(i); // This is the LCM
            break;                 // Stop the loop once the LCM is found
        } 

            }
           

   }

    
}
