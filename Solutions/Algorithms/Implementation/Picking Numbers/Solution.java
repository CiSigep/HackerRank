import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] val = new int[100];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            val[a[a_i] - 1]++;
        }
        
        int answer = 2;
        
        for(int i = 0; i < 98; i++)
        {
            int count =  val[i] + val[i + 1];
            answer = Math.max(answer, count);
        }
        
        System.out.println(answer);
    }
}
