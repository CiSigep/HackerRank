import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> h = new HashMap<Character, Integer>();
        char letter = 'a';
        for(int h_i=0; h_i < 26; h_i++){
            h.put(letter, in.nextInt());
            letter++;
        }
        String word = in.next();
        int length = word.length();
        int maxHeight = 0;
        for(char c : word.toCharArray())
        {
            maxHeight = Math.max(maxHeight, h.get(c));
        }
        
        System.out.println(maxHeight * length);
    }
}
