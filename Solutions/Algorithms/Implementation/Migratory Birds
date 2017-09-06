import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int[] freq = new int[] {0, 0, 0, 0, 0};
        
        for(int b : ar)
        {
            freq[b - 1]++;
        }
        
        int maxFreqType = 1;
        
        for(int i = 1; i < freq.length; i++ ){
            if(freq[i] > freq[maxFreqType - 1])
                maxFreqType = i + 1;
        }
        
        return maxFreqType;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
