import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int maxHeight = 0;
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            maxHeight = Math.max(height[height_i], maxHeight);
        }
        // your code goes here
        int difference = maxHeight - k;
        System.out.println(difference >= 0 ? difference : 0);
    }
}
