import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int col = (int) Math.ceil(Math.sqrt(str.length()));
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i = 0; i < col; i++){
            for(int j = i; j < str.length(); j += col)
                sb.append(str.charAt(j));
            
            sb.append(" ");
        }
        
        System.out.println(sb.toString());
        
        
        
    }
}
