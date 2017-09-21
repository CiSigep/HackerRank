import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), t = in.nextInt();
        int[] w = new int[n];
        for(int i = 0; i < n; i++)
            w[i] = in.nextInt();
        
        for(int i = 0; i < t; i++){
            int min = 3;
            int a = in.nextInt(), b = in.nextInt();
            
            for(int j = a; j <= b; j++)
                min = Math.min(min, w[j]);
            System.out.println(min);
        }
            
    }
}
