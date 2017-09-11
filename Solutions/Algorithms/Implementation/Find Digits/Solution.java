import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numTests = in.nextInt();
        for(int i = 0; i < numTests; i++){
            int value = in.nextInt();
            char[] digits = Integer.toString(value).toCharArray();
            int count = 0;
            for(char c : digits){
                int digit = Character.getNumericValue(c);
                if(digit != 0 && value % digit == 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
