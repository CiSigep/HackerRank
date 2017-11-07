import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int n = in.nextInt();
        BitSet[] bits = new BitSet[2];
        bits[0] = new BitSet();
        bits[1] = new BitSet();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String op = in.next();
            int val1 = in.nextInt();
            int val2 = in.nextInt();
            if("AND".equals(op))
                bits[val1 - 1].and(bits[val2 - 1]);
            else if("OR".equals(op))
                bits[val1 - 1].or(bits[val2 - 1]);
            else if("XOR".equals(op))
                bits[val1 - 1].xor(bits[val2 - 1]);
            else if("FLIP".equals(op))
                bits[val1 - 1].flip(val2);
            else if("SET".equals(op))
                bits[val1 - 1].set(val2);
                
            sb.append(bits[0].cardinality() + " " + bits[1].cardinality());
            if(i != n - 1)
                sb.append("\n");
        }
        
        System.out.println(sb);
    }
}
