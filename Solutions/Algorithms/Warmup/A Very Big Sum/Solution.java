import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = BigInteger.valueOf(0);
        for(int arr_i=0; arr_i < n; arr_i++){
            sum = sum.add(BigInteger.valueOf((in.nextInt())));
        }
        System.out.println(sum);
    }
}