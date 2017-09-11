import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTests = in.nextInt();
        
        for(int i = 0; i < numTests; i ++){
            int a = in.nextInt(), b = in.nextInt();
            double lowerRoot = Math.sqrt(a), upperRoot = Math.sqrt(b);
            int squareCount = (int) Math.floor(upperRoot) - (int) Math.ceil(lowerRoot) + 1;
            System.out.println(squareCount);
        }
    }
}
