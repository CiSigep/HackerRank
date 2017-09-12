import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        long repeats = n / s.length();
        long remains = n % s.length();
        long count = 0;
        long remainderCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a'){
                count++;
                if(i < remains)
                    remainderCount++;
            }
        }
        
        count *= repeats;
        count += remainderCount;    
        
        
        System.out.println(count);
    }
}
