import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        int[][] mm = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
        
        // Assumptions are 3 by 3 square of numbers 1-9. Every summation of a line is the same number, in this case 15
        // Center will always be 5 and numbers are paired to equal 10 (e.g 1 to 9, 2 to 8, etc.)
        int cost = matrixConversionCost(s, mm); // Start with initial cost
        // Rotate and compare
        for(int i = 0; i < 3; i++)
        {
            mm = rotate3By3MatrixRight(mm);
            cost = Math.min(cost, matrixConversionCost(s, mm));
        }
        mm = rotate3By3MatrixRight(mm); // Rotate one last time to reset;
        
        // Vertical flip
        mm = flip3By3MatrixVertical(mm);
        cost = Math.min(cost, matrixConversionCost(s, mm));
        mm = flip3By3MatrixVertical(mm); // reset
        
        
        // Horizontal Flip
        mm = flip3By3MatrixHorizontal(mm);
        cost = Math.min(cost, matrixConversionCost(s, mm));
        mm = flip3By3MatrixHorizontal(mm); // reset
        
        // Rotate + Flip
        mm = rotate3By3MatrixRight(mm);
        mm = flip3By3MatrixHorizontal(mm);
        cost = Math.min(cost, matrixConversionCost(s, mm));
        mm = flip3By3MatrixHorizontal(mm);
        mm = rotate3By3MatrixRight(mm);
        mm = rotate3By3MatrixRight(mm);
        mm = flip3By3MatrixHorizontal(mm);
        cost = Math.min(cost, matrixConversionCost(s, mm));
        
        System.out.println(cost);
        
    }
    
    private static int matrixConversionCost(int[][] im, int[][] mm){
        int cost = 0;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                cost += Math.abs(mm[i][j] - im[i][j]);
        
        return cost;
    }
    
    private static int[][] rotate3By3MatrixRight(int[][] mm)
    {
        int[][] newMM = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 2; j >= 0; j--)
                newMM[i][2 - j] = mm[j][i];
        
        return newMM;
    }
    
    private static int[][] flip3By3MatrixHorizontal(int[][] mm){
        int[][] newMM = new int[3][3];
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                newMM[i][j] = mm[i][2 - j];
        
        return newMM;
    }
    
    private static int[][] flip3By3MatrixVertical(int[][] mm){
        int[][] newMM = new int[3][3];
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                newMM[i][j] = mm[2 - i][j];
        
        
        return newMM;
    }
}
