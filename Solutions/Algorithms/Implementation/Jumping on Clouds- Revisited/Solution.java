import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int e = 100, c_i = 0;
        do{
            e--;
            c_i = (c_i + k) % n;
            if(c[c_i] == 1)
                e -= 2;
            
        } while (c_i != 0);
            
        System.out.println(e);
        
    }
}
