import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = in.nextInt();
        
        int count = 0;
        for(int i = min; i <= max; i++)
        {
            BigInteger val = BigInteger.valueOf(i);
            BigInteger square = val.multiply(val);
            
            String squareStr = square.toString();
            String l = squareStr.substring(0, squareStr.length() / 2);
            String r = squareStr.substring(squareStr.length() / 2);
            BigInteger lVal = l.isEmpty() ? BigInteger.ZERO : new BigInteger(l);
            BigInteger rVal = r.isEmpty() ? BigInteger.ZERO : new BigInteger(r);
            

            
            if(val.equals(lVal.add(rVal))){
                System.out.print(i + " ");
                count++;
            }
            
            
        }
        if(count == 0)
            System.out.println("INVALID RANGE");
    }
}
