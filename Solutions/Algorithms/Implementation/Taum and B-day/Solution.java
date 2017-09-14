import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long cost = 0;
            // Cases
            
            // Benefit from converting b -> w
            // Benefit from converting w -> b
            // Non benefit from conversion
            if(x + z < y)
                cost = b * x + w * (x + z);
            else if(y + z < x)
                cost = w * y + b * (y + z);
            else if(x + z >= y && y + z >= x)
                cost = b * x + w * y;
            
            System.out.println(cost);
            
        }
    }
}
