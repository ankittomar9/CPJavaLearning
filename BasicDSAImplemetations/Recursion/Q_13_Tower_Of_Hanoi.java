package basicDSAImplemetations.Recursion;

public class Q_13_Tower_Of_Hanoi {
    public static void main(String args[]){
        int n=3;

        Tower_Hanoi_Solver(n,"A","B","C");
    }

 public static void Tower_Hanoi_Solver(int n,String src,String helper,String dest){

        if(n==1){
             System.out.println("Move Disk 1 from "+src + " to "+ dest);
            return;
        }
       
      Tower_Hanoi_Solver(n-1,src,dest,helper);
      System.out.println("Move Disk "+ n + " from "+src+ " to "+ dest);
      Tower_Hanoi_Solver(n-1,helper,src,dest);

    }
    
}
