import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int hops = 0;
        int i = 0;
        while(i < c.length - 1)
        {
            if(i + 2 <= c.length - 1 && c[i + 2] == 0)
                i += 2;
            else
                i++;
            hops++;
        }
        
        System.out.println(hops);
    }
}
