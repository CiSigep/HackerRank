import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigInteger value = BigInteger.valueOf(N);
        N--;
        
        while(N > 0)
        {
            value = value.multiply(BigInteger.valueOf(N));
            N--;
        }
        
        System.out.println(value);
    }
}
