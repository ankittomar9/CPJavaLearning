package BasicDSAImplemetations.HashMaps;
import java.util.HashSet;
public class Q_24_Valid_Sudoku {
    public static void main(String args[]){
       char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Board 1 (Valid): \n" + isValidSudoku(board1) + "\n");

        char[][] board2 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','5','.','.','.','.','6','.'}, // Changed '8' to '5'
            // ... rest of board omitted for brevity
        };
        System.out.println("Board 2 (Invalid - Duplicate 5 in top-left box): \n" + isValidSudoku(board2));
    }
    public static boolean isValidSudoku( char board[][]){
        HashSet<String> seen= new HashSet<>();

        for(int i=0;i<9;i++){   
            for(int j=0;j<9;j++){
                char currentVal=board[i][j];

                if(currentVal !='.'){
                    String rowBadge=currentVal + " in row " +i;
                    String colBadge =currentVal + " in col "+j;
                    String boxBadge =currentVal + " in box "+(i/3)+ "-"+ (j/3);
                    
                    if(!seen.add(rowBadge)|| !seen.add(colBadge)|| !seen.add(boxBadge)){
                        return false;
                    } 
                }
            }
        }
        return true;
    }
}
