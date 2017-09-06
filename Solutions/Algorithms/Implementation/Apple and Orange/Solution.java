import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int landedCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int loc = apple[apple_i] + a;
            if(loc >= s && loc <= t)
                landedCount++;
        }
        System.out.println(landedCount);
        landedCount = 0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int loc = orange[orange_i] + b;
            if(loc >= s && loc <= t)
                landedCount++;
        }
        System.out.println(landedCount);
    }
}
