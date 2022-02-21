import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] chess = new int [n][n];
        printNQueens(chess, "",0);
    }

    public static boolean isSafeToPlay(int [][] chess, int r, int c){
        //1st direction (i-1,j-1)
        for(int i = r-1, j = c-1; i>=0 && j>=0; i--,j--){
            if(chess[i][j] == 1)
                return false;
        }
        //2nd direction(i-1, j)
        for(int i = r-1, j = c; i>=0; i--){
            if(chess[i][j] == 1)
                return false;
        }
        //3rd direction(i-1,j+1)
        for(int i = r-1, j = c+1; i>=0 && j<chess[0].length; i--, j++){
            if(chess[i][j] == 1)
                return false;
        }
        return true;

    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf+".");
            return;
        }
        for(int col=0; col<chess[0].length; col++){
            if(isSafeToPlay(chess, row, col)){
                chess[row][col]=1;
                printNQueens(chess, qsf +row+"-"+col+", ", row+1);
                chess[row][col]=0;
            }
        }
    }
}