import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        
        for(int i = 1; i <= n; i++)
            values.put(in.nextInt(), i);
            
        for(int i = 1; i <= n; i ++) {
            int p_value = values.get(values.get(i));
            System.out.println(p_value);
        }
            
    }
}
