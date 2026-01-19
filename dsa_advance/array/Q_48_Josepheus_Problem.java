package dsa_advance.array;

public class Q_48_Josepheus_Problem {
    public static void main(String args[]){
        int N=100; // 11 12 6  5  73 any number
            solveJosephus(N);
                System.out.println("Survivor for n=" + N + " is: " + solveJosephus(N));
    }
    public static int solveJosephus(int N) {
    int p=1;
    while(p*2<=N){
        p=p*2;
    }
                int l=N-p;
                    int winner=2*l+1;
                    return winner;
    }
    
}
