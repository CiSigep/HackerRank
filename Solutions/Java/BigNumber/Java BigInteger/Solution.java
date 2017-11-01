import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        BigInteger one = new BigInteger(in.nextLine());
        BigInteger two = new BigInteger(in.nextLine());
        
        BigInteger addResult = one.add(two);
        BigInteger mulResult = one.multiply(two);
        
        System.out.println(addResult.toString() + "\n" + mulResult.toString());
    }
}
