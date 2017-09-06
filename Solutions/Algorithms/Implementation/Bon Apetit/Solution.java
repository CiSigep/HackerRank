import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void bonAppetit(int n, int k, int b, int[] ar) {
        int total = 0;
        for(int i = 0; i < ar.length; i++)
            if(i != k)
               total += ar[i];
        
        double b_actual = total / 2.0;
        System.out.println(b_actual == (double) b ?  "Bon Appetit" :  (int) (b - b_actual));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}
