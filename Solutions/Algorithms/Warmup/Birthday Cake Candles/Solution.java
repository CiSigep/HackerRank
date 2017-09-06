import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar, int max) {
        int candleCount = 0;
        for(int c : ar)
            if(max == c)
                candleCount++;
        
        return candleCount;
            
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int maxHeight = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(ar[ar_i] > maxHeight)
                maxHeight = ar[ar_i];
        }
        int result = birthdayCakeCandles(n, ar, maxHeight);
        System.out.println(result);
    }
}
