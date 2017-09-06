import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int posCount = 0;
        int negCount = 0;
        int zerCount = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            int val = in.nextInt();
            if(val  > 0)
                posCount++;
            else if(val  < 0)
                negCount++;
            else
                zerCount++;
        }
        DecimalFormat dm = new DecimalFormat("0.000000");
        
        System.out.println(dm.format((float)(posCount)/n));
        System.out.println(dm.format((float)(negCount)/n));
        System.out.println(dm.format((float)(zerCount)/n));
    }
}
