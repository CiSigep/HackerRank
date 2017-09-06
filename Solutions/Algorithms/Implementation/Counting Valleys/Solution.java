import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        in.nextLine();
        
        String input = in.nextLine();
        
        
        int height = 0, vCount = 0;
        for(char c : input.toCharArray()){
            // Valleys are points where height < 0 from where height == 0
            int newHeight;
            
            if('U' == c)
                newHeight = height + 1;
            else // 'D' == c
                newHeight = height - 1;
            
            if(height == 0 && newHeight < 0)
                vCount++;
            
            height = newHeight;
        }
        
        System.out.println(vCount);
        
    }
}
