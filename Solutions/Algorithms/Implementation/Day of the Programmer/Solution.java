import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Case for Julian 
        if(year < 1918){
            if(year % 4 == 0)
                return "12.09." + year;
            
            return "13.09." + year;
        }
        // Case for transition
        else if(year == 1918){
            return "26.09.1918";
        }
        
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return "12.09." + year;

        return "13.09." + year;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
