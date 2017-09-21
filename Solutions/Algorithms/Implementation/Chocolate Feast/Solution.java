import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        
        for(int i = 0; i < tests; i++){
            int n = in.nextInt(), c = in.nextInt(), m = in.nextInt();
            int amount = n / c;
            int total = amount;
            while(amount >= m)
            {              
                int remainder = amount % m;
                amount /= m;
                total += amount;
                amount += remainder;
            }
            
            System.out.println(total);
        }
            
    }
}
