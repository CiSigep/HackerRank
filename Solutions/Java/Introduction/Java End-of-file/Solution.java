import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while(scan.hasNext())
        {
            sb.append(count + " " + scan.nextLine() + "\n");
            count++;
        }
        
        System.out.println(sb);
    }
}
