import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 10; i++)
            sb.append(N + " x " + i + " = " +(N * i) + "\n");
        
        System.out.println(sb.toString());
    }
}
