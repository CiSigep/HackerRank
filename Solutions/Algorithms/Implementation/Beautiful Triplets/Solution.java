import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), d = in.nextInt();
        // a_j - a_i = a_k - a_j = d, a_i < a_j < a_k
        // a_k - a_j = d
        // a_k = d + a_j
        // a_j - a_i = d
        // a_j = d + a_i
        // a_k = d + (d + a_i)
        // a_k = 2 * d + a_i
        // So a_k = d + a_j = 2 * d + a_i 
        
        List<Integer> available = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0; i < n; i++){
            int val = in.nextInt();
            if(available.contains(val - 2 * d) && available.contains(val - d))
                count++;
            available.add(val);
        }
        System.out.println(count);
            
    }
}
