import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        int[] results = new int[grades.length];
        
        for(int i = 0; i < grades.length; i++){
            int newG = grades[i];
            if(grades[i] >= 38){
                int modG = grades[i] % 5;
                if(modG > 2)
                    newG = grades[i] + (5 - modG);
            }
            results[i] = newG;    
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
