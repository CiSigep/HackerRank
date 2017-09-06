import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Where j = number of jumps
        // y1 = v1 * j + x1
        // y2 = v2 * j + x2
        // What j value does y1 = y2
        // v1 * j + x1 = v2 * j + x2
        // v1 * j + x1 - x2 = v2 * j
        // x1 - x2 = v2 * j - v1 * j
        // (x1 - x2) / (v2 - v1) = j
        
        // x2 > x1 is assumed so if (v2 >= v1) we'll never catch up
        if(v2 >= v1)
            return "NO";
        
        int j = (x1 - x2) / (v2 - v1);
        int modJ = (x1 - x2) % (v2 - v1);
        
        // j can't be negative nor mod j have any value besides 0 if they meet on the same jump and not in midair.
        // x1 will never start out equal to x2 so we don't have to worry about j == 0 case
        if(j > 0 && modJ == 0)
            return "YES";
        //else
        return "NO";
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
