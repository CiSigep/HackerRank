import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set = new HashSet<String>();


        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++){
            set.add(pair_left[i] + " " + pair_right[i]);
            sb.append(set.size());
            if(i != t - 1)
                sb.append("\n");
        }

        System.out.println(sb);
   }
}
