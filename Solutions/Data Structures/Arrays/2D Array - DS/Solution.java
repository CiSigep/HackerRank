import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -64; // Lowest possible value for this problem is -9 * 7 = -63, make the max lower than is to have an answer regardless 
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                max = Math.max(max, hourglassValue(i, j, arr));
            }
        }
        
        System.out.println(max);
        
    }
    
    private static int hourglassValue(int r, int c, int[][] a){
        if(r - 1 < 0 || r + 1 >=  6 || c - 1 < 0 || c + 1 >= 6)
            return -64; // Out of bounds check
        
        return a[r][c] + a[r - 1][c] + a[r + 1][c] + a[r - 1][c - 1] + a[r - 1][c + 1] + a[r + 1][c - 1] + a[r + 1][c + 1];
    }
}
