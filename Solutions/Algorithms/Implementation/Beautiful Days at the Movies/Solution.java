import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt(), j = in.nextInt(), k = in.nextInt();
        int dayCount = 0;
        
        for(int n = i; n <= j; n++){
            StringBuilder sb = new StringBuilder(Integer.toString(n));
            sb.reverse(); // reverse
            while(sb.charAt(0) == '0') // remove leading 0's
                sb.deleteCharAt(0);
            int revN = Integer.parseInt(sb.toString());
            
            if(Math.abs(n - revN) % k == 0)
                dayCount++;
        }
        
        System.out.println(dayCount);
        
        
    }
}
