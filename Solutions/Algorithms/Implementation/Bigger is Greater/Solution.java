import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String str = in.next();
            int j;
            for(j = str.length() - 1; j > 0 && str.charAt(j) <= str.charAt(j - 1); j--);
            
            if(j == 0)
                System.out.println("no answer");
            else{
                int k;
                for(k = str.length() - 1; str.charAt(k) <= str.charAt(j - 1); k--);
                
                StringBuilder sb = new StringBuilder();
                for(int l = 0; l < j - 1; l++)
                    sb.append(str.charAt(l));
                
                sb.append(str.charAt(k));
                StringBuilder suf = new StringBuilder(str.substring(j));
                suf.replace(k - str.substring(0, j - 1).length() - 1, k - str.substring(0, j - 1).length(), Character.toString(str.charAt(j - 1)));
                suf.reverse();
                
                sb.append(suf.toString());
                
                System.out.println(sb.toString());
                
            }
        }
            
    }
}
