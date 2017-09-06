import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < n; j++)
            sb.append(" ");
        
        int k = 0;    
        
        for(int i = 1; i <= n; i++){
            sb.replace(sb.length() - i,sb.length() - k,"#");
            System.out.println(sb.toString());
            k++;
        }
        
    }
}
