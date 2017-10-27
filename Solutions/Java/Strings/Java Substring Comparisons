import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;
        
        for(int i = 1; i + k <= s.length(); i++){
            String sub = s.substring(i, i + k);
            if(largest.compareTo(sub) < 0)
                largest = sub;
            if(smallest.compareTo(sub) > 0)
                smallest = sub;
        }
            
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
