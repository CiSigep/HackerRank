import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int lcm_a = a[0];
        for(int i = 1; i < a.length; i++)
            lcm_a = lcm(lcm_a, a[i]);
        
        int gcd_b = b[0];
        for(int i = 1; i < b.length; i++)
            gcd_b = gcd(gcd_b, b[i]);
        
        int count = 0;
        for(int i = 1; lcm_a * i <= gcd_b; i++)
            if(gcd_b % (lcm_a * i) == 0){
                count++;
            }

        return count;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
    
    private static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    
    private static int gcd(int a, int b){
        if(b == 0)
            return a;
        
        return gcd(b, a % b);
    }
}
